package com.neptunesoft.bacdz;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Insets;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.neptunesoft.bacdz.adapter.SolutionsAdapter;
import com.neptunesoft.bacdz.adapter.TopicsAdapter;
import com.neptunesoft.bacdz.adapter.ViewPagerAdapter;
import com.neptunesoft.bacdz.fragment.SolutionsFragment;
import com.neptunesoft.bacdz.fragment.TopicsFragment;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.io.IOUtils;

/* loaded from: classes4.dex */
public class TopicsSolutionsActivity extends AppCompatActivity {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DIALOG_DOWNLOAD_PROGRESSE = 1;
    public static String file_Name;
    public static Handler handler = new Handler();
    static TopicsSolutionsActivity instance;
    static boolean isCancelled;
    public static boolean topics;
    boolean ad_showing;
    private AlertDialog dialog_connect_internet;
    private AlertDialog dialog_download_files;
    private AlertDialog dialog_internet_low;
    private AlertDialog dialog_nointernet;
    private ProgressDialog dialog_wait_check;
    int lengthofFileDownload;
    InterstitialAd mInterstitialAd;
    private ProgressDialog progressDialog;
    StorageReference storageRef;
    StorageReference storageReference;
    private TabLayout tablayoutTopicsSolutions;
    PowerManager.WakeLock wakeLock;
    int count_time_wait = -1;
    Runnable time_wait_out = new Runnable() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity.4
        @Override // java.lang.Runnable
        public void run() {
            if (TopicsSolutionsActivity.this.count_time_wait < 15) {
                TopicsSolutionsActivity.this.count_time_wait++;
                TopicsSolutionsActivity.handler.postDelayed(TopicsSolutionsActivity.this.time_wait_out, 1000L);
                return;
            }
            if (!TopicsSolutionsActivity.this.test_connection()) {
                TopicsSolutionsActivity.this.no_connection();
            } else if (!TopicsSolutionsActivity.this.ad_showing) {
                TopicsSolutionsActivity.this.connection_low();
            }
            TopicsSolutionsActivity.this.count_time_wait = -1;
            TopicsSolutionsActivity.this.getWindow().clearFlags(128);
            TopicsSolutionsActivity.handler.removeCallbacks(TopicsSolutionsActivity.this.time_wait_out);
        }
    };
    Runnable buffer_onPostExecute = new Runnable() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity.5
        @Override // java.lang.Runnable
        public void run() {
            if (TopicsSolutionsActivity.this.progressDialog != null) {
                TopicsSolutionsActivity.this.progressDialog.setProgress(0);
            }
            TopicsSolutionsActivity.this.write_file_download("file_download.txt", "");
            String read_file_download = TopicsSolutionsActivity.this.read_file_download("file_download.txt");
            if (read_file_download != null) {
                TopicsSolutionsActivity.this.delete_file(read_file_download);
                TopicsSolutionsActivity.this.write_file_download("file_download.txt", "");
            }
            try {
                TopicsSolutionsActivity.handler.removeCallbacks(TopicsSolutionsActivity.this.time_wait_out);
                TopicsSolutionsActivity.this.count_time_wait = -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                TopicsSolutionsActivity.this.close_dialog();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (new File(TopicsSolutionsActivity.this.getFilesDir().getAbsoluteFile() + "/" + TopicsSolutionsActivity.file_Name).length() == TopicsSolutionsActivity.this.lengthofFileDownload) {
                if (TopicsSolutionsActivity.topics) {
                    TopicsAdapter.change();
                } else {
                    SolutionsAdapter.change();
                }
                Toast.makeText(TopicsSolutionsActivity.this, "تم تحميل الملف بنجاح.", 1).show();
            } else {
                TopicsSolutionsActivity.this.delete_file(TopicsSolutionsActivity.file_Name);
                Toast.makeText(TopicsSolutionsActivity.this, "تعذر عملية تحميل الملف '" + TopicsSolutionsActivity.file_Name + "' تحقق من إتصال الجهاز بالشبكة !.", 1).show();
            }
            TopicsSolutionsActivity.this.dismissDialog(1);
            TopicsSolutionsActivity.this.getWindow().clearFlags(128);
            TopicsSolutionsActivity.handler.removeCallbacks(TopicsSolutionsActivity.this.buffer_onPostExecute);
        }
    };
    Runnable write_file_download = new Runnable() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity.6
        @Override // java.lang.Runnable
        public void run() {
            TopicsSolutionsActivity.this.write_file_download("file_download.txt", TopicsSolutionsActivity.file_Name);
            TopicsSolutionsActivity.handler.removeCallbacks(TopicsSolutionsActivity.this.write_file_download);
        }
    };
    Runnable write_file_download_null = new Runnable() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity.7
        @Override // java.lang.Runnable
        public void run() {
            TopicsSolutionsActivity.this.write_file_download("file_download.txt", "");
            TopicsSolutionsActivity.handler.removeCallbacks(TopicsSolutionsActivity.this.write_file_download_null);
        }
    };
    Runnable delete_file = new Runnable() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity.8
        @Override // java.lang.Runnable
        public void run() {
            if (TopicsSolutionsActivity.this.files_exist(TopicsSolutionsActivity.file_Name)) {
                TopicsSolutionsActivity.this.delete_file(TopicsSolutionsActivity.file_Name);
            }
            TopicsSolutionsActivity.this.write_file_download("file_download.txt", "");
            TopicsSolutionsActivity.handler.removeCallbacks(TopicsSolutionsActivity.this.delete_file);
        }
    };

    public static TopicsSolutionsActivity getInstance() {
        return instance;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;
        setContentView(R.layout.activity_topics_solutions);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), new OnApplyWindowInsetsListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity$$ExternalSyntheticLambda13
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return TopicsSolutionsActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        String read_file_download = read_file_download("file_download.txt");
        if (read_file_download != null) {
            delete_file(read_file_download);
            write_file_download("file_download.txt", "");
        }
        MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity$$ExternalSyntheticLambda14
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public final void onInitializationComplete(InitializationStatus initializationStatus) {
                TopicsSolutionsActivity.this.m765lambda$onCreate$1$comneptunesoftbacdzTopicsSolutionsActivity(initializationStatus);
            }
        });
        this.tablayoutTopicsSolutions = (TabLayout) findViewById(R.id.tablayoutTopicsSolutions);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpagerTopicsSolutions);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new SolutionsFragment(), "");
        viewPagerAdapter.addFragment(new TopicsFragment(), "");
        viewPager.setAdapter(viewPagerAdapter);
        this.tablayoutTopicsSolutions.setupWithViewPager(viewPager);
        this.tablayoutTopicsSolutions.getTabAt(1).select();
        if (((TabLayout.Tab) Objects.requireNonNull(this.tablayoutTopicsSolutions.getTabAt(0))).isSelected()) {
            ((TabLayout.Tab) Objects.requireNonNull(this.tablayoutTopicsSolutions.getTabAt(0))).setIcon(R.drawable.ic_startab_click);
            if (SplashScreen.darkmode) {
                ((TabLayout.Tab) Objects.requireNonNull(this.tablayoutTopicsSolutions.getTabAt(1))).setIcon(R.drawable.ic_circle_dark);
            } else {
                ((TabLayout.Tab) Objects.requireNonNull(this.tablayoutTopicsSolutions.getTabAt(1))).setIcon(R.drawable.ic_circle);
            }
        } else if (((TabLayout.Tab) Objects.requireNonNull(this.tablayoutTopicsSolutions.getTabAt(1))).isSelected()) {
            ((TabLayout.Tab) Objects.requireNonNull(this.tablayoutTopicsSolutions.getTabAt(1))).setIcon(R.drawable.ic_circle_click);
            if (SplashScreen.darkmode) {
                ((TabLayout.Tab) Objects.requireNonNull(this.tablayoutTopicsSolutions.getTabAt(0))).setIcon(R.drawable.ic_startab_dark);
            } else {
                ((TabLayout.Tab) Objects.requireNonNull(this.tablayoutTopicsSolutions.getTabAt(0))).setIcon(R.drawable.ic_startab);
            }
        }
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity.1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float v, int i1) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (i == 0) {
                    ((TabLayout.Tab) Objects.requireNonNull(TopicsSolutionsActivity.this.tablayoutTopicsSolutions.getTabAt(0))).setIcon(R.drawable.ic_startab_click);
                    if (SplashScreen.darkmode) {
                        ((TabLayout.Tab) Objects.requireNonNull(TopicsSolutionsActivity.this.tablayoutTopicsSolutions.getTabAt(1))).setIcon(R.drawable.ic_circle_dark);
                        return;
                    } else {
                        ((TabLayout.Tab) Objects.requireNonNull(TopicsSolutionsActivity.this.tablayoutTopicsSolutions.getTabAt(1))).setIcon(R.drawable.ic_circle);
                        return;
                    }
                }
                if (i != 1) {
                    return;
                }
                ((TabLayout.Tab) Objects.requireNonNull(TopicsSolutionsActivity.this.tablayoutTopicsSolutions.getTabAt(1))).setIcon(R.drawable.ic_circle_click);
                if (SplashScreen.darkmode) {
                    ((TabLayout.Tab) Objects.requireNonNull(TopicsSolutionsActivity.this.tablayoutTopicsSolutions.getTabAt(0))).setIcon(R.drawable.ic_startab_dark);
                } else {
                    ((TabLayout.Tab) Objects.requireNonNull(TopicsSolutionsActivity.this.tablayoutTopicsSolutions.getTabAt(0))).setIcon(R.drawable.ic_startab);
                }
            }
        });
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets platformInsets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).toPlatformInsets();
            i = platformInsets.left;
            i2 = platformInsets.top;
            i3 = platformInsets.right;
            i4 = platformInsets.bottom;
            view.setPadding(i, i2, i3, i4);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-bacdz-TopicsSolutionsActivity, reason: not valid java name */
    /* synthetic */ void m765lambda$onCreate$1$comneptunesoftbacdzTopicsSolutionsActivity(InitializationStatus initializationStatus) {
        Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
        for (String str : adapterStatusMap.keySet()) {
            AdapterStatus adapterStatus = adapterStatusMap.get(str);
            Log.d("MyApp", String.format("Adapter name: %s, Description: %s, Latency: %d", str, adapterStatus.getDescription(), Integer.valueOf(adapterStatus.getLatency())));
        }
        loadAdMobInterstitialAds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAdMobInterstitialAds() {
        InterstitialAd.load(this, getString(R.string.Interstitial_Topics_Solutions_UnitId), new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity.2
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd interstitialAd) {
                TopicsSolutionsActivity.this.mInterstitialAd = interstitialAd;
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                TopicsSolutionsActivity.this.mInterstitialAd = null;
            }
        });
    }

    public void showInterstitialAds(final String url) {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(this);
            this.mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity.3
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    TopicsSolutionsActivity.this.ad_showing = true;
                    TopicsSolutionsActivity.this.mInterstitialAd = null;
                    TopicsSolutionsActivity.this.loadAdMobInterstitialAds();
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    TopicsSolutionsActivity.this.ad_showing = false;
                    TopicsSolutionsActivity.this.download(url);
                }
            });
        } else {
            download(url);
            loadAdMobInterstitialAds();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void download(String url_file) {
        isCancelled = false;
        StringBuilder sb = new StringBuilder();
        if (file_Name.length() < 16) {
            sb = new StringBuilder(file_Name);
        } else {
            for (int i = 0; i < 12; i++) {
                sb.append(file_Name.charAt(i));
            }
            sb.insert(0, "...");
        }
        String str = "إسم الملف : " + ((Object) sb);
        ProgressDialog progressDialog = this.progressDialog;
        if (progressDialog != null) {
            progressDialog.setMessage(str + "\nحجم الملف : جاري حساب حجم الملف");
        }
        new DownloadFileAsync().execute(url_file);
    }

    public void geturl_download(String fileName) {
        StorageReference reference = FirebaseStorage.getInstance().getReference();
        this.storageReference = reference;
        this.storageRef = reference.child(fileName);
        write_file_download("file_download.txt", fileName);
        this.storageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity$$ExternalSyntheticLambda11
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                TopicsSolutionsActivity.this.m761x9eafdb8f((Uri) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity$$ExternalSyntheticLambda12
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                TopicsSolutionsActivity.this.m763xff1e4e52(exc);
            }
        });
    }

    /* renamed from: lambda$geturl_download$2$com-neptunesoft-bacdz-TopicsSolutionsActivity, reason: not valid java name */
    /* synthetic */ void m761x9eafdb8f(Uri uri) {
        if (this.count_time_wait != -1) {
            showInterstitialAds(uri.toString());
        }
    }

    /* renamed from: lambda$geturl_download$5$com-neptunesoft-bacdz-TopicsSolutionsActivity, reason: not valid java name */
    /* synthetic */ void m763xff1e4e52(Exception exc) {
        try {
            handler.removeCallbacks(this.time_wait_out);
            this.count_time_wait = -1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        close_dialog();
        final AlertDialog create = new AlertDialog.Builder(this).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity$$ExternalSyntheticLambda15
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                TopicsSolutionsActivity.this.m762x142a01d0(create, dialogInterface);
            }
        });
        create.setTitle("Error !.");
        create.setMessage("عذرا هناك خطأ في الحصول على رابط تحميل الملف من الخادم, و ذلك بسبب كمية البيانات المحدودة و الخاصة بتحميل ملفات التطبيق على هواتفكم نحن نعمل على توسيع خدماتنا على مستوى الخوادم الخاصة بـ Firebase نتمنى أن تتفهم المشكلة كما يمكنك المحاولة من حين إلى آخر في مدة أقصاها 24 ساعة .");
        create.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity$$ExternalSyntheticLambda16
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* renamed from: lambda$geturl_download$3$com-neptunesoft-bacdz-TopicsSolutionsActivity, reason: not valid java name */
    /* synthetic */ void m762x142a01d0(AlertDialog alertDialog, DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        alertDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    private void download_files(final String fileName) {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_download_files = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                TopicsSolutionsActivity.this.m758x12ccca3f(dialogInterface);
            }
        });
        this.dialog_download_files.setCancelable(false);
        this.dialog_download_files.setMessage("هل تريد تحميل الملف ؟.");
        this.dialog_download_files.setButton(-1, "تحميل", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                TopicsSolutionsActivity.this.m759x8846f080(fileName, dialogInterface, i);
            }
        });
        this.dialog_download_files.setButton(-2, "رفض", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                TopicsSolutionsActivity.this.m760xfdc116c1(dialogInterface, i);
            }
        });
        this.dialog_download_files.show();
    }

    /* renamed from: lambda$download_files$6$com-neptunesoft-bacdz-TopicsSolutionsActivity, reason: not valid java name */
    /* synthetic */ void m758x12ccca3f(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_download_files.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        this.dialog_download_files.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$download_files$7$com-neptunesoft-bacdz-TopicsSolutionsActivity, reason: not valid java name */
    /* synthetic */ void m759x8846f080(String str, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (test_connection()) {
            dialog_wait();
            getWindow().addFlags(128);
            geturl_download(str);
            return;
        }
        no_connection();
    }

    /* renamed from: lambda$download_files$8$com-neptunesoft-bacdz-TopicsSolutionsActivity, reason: not valid java name */
    /* synthetic */ void m760xfdc116c1(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        getWindow().clearFlags(128);
    }

    public void write_file_download(String file, String file_name_download) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    PrintWriter printWriter = new PrintWriter(openFileOutput(file, 0));
                    printWriter.print("");
                    printWriter.close();
                    fileOutputStream = openFileOutput(file, 0);
                    fileOutputStream.write(file_name_download.getBytes());
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            } catch (Throwable th) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    public void connection_low() {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_internet_low = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity$$ExternalSyntheticLambda9
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                TopicsSolutionsActivity.this.m757xa0fabd75(dialogInterface);
            }
        });
        this.dialog_internet_low.setCancelable(false);
        this.dialog_internet_low.setMessage("تعذر عملية الإتصال بالخادم, حاول مرة أخرى !.");
        this.dialog_internet_low.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity$$ExternalSyntheticLambda10
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_internet_low.show();
    }

    /* renamed from: lambda$connection_low$9$com-neptunesoft-bacdz-TopicsSolutionsActivity, reason: not valid java name */
    /* synthetic */ void m757xa0fabd75(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_internet_low.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    private void dialog_wait() {
        getWindow().addFlags(128);
        close_dialog();
        this.count_time_wait = 0;
        handler.postDelayed(this.time_wait_out, 1000L);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.dialog_wait_check = progressDialog;
        progressDialog.setCancelable(false);
        this.dialog_wait_check.show();
        this.dialog_wait_check.setContentView(R.layout.progressdialogdownloadfiles);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void no_connection() {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_nointernet = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                TopicsSolutionsActivity.this.m764x8308e2d5(dialogInterface);
            }
        });
        this.dialog_nointernet.setCancelable(false);
        this.dialog_nointernet.setMessage("لا يوجد إتصال بالشبكة !.");
        this.dialog_nointernet.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_nointernet.show();
    }

    /* renamed from: lambda$no_connection$11$com-neptunesoft-bacdz-TopicsSolutionsActivity, reason: not valid java name */
    /* synthetic */ void m764x8308e2d5(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_nointernet.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    public boolean files_exist(String fileName) {
        return new File(getFilesDir(), fileName).exists();
    }

    public boolean test_connection() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    private void connect_internet() {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_connect_internet = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                TopicsSolutionsActivity.this.m756xe97655a3(dialogInterface);
            }
        });
        this.dialog_connect_internet.setCancelable(false);
        this.dialog_connect_internet.setMessage("قم بالإتصال بالشبكة لتحميل الملف");
        this.dialog_connect_internet.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_connect_internet.show();
    }

    /* renamed from: lambda$connect_internet$13$com-neptunesoft-bacdz-TopicsSolutionsActivity, reason: not valid java name */
    /* synthetic */ void m756xe97655a3(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_connect_internet.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int id) {
        if (id != 1) {
            return null;
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.progressDialog = progressDialog;
        progressDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity$$ExternalSyntheticLambda7
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                TopicsSolutionsActivity.this.m766x6a644898(dialogInterface);
            }
        });
        this.progressDialog.setProgressNumberFormat(null);
        this.progressDialog.setTitle("Download...");
        StringBuilder sb = new StringBuilder();
        if (file_Name.length() < 16) {
            sb = new StringBuilder(file_Name);
        } else {
            for (int i = 0; i < 12; i++) {
                sb.append(file_Name.charAt(i));
            }
            sb.insert(0, "...");
        }
        ProgressDialog progressDialog2 = this.progressDialog;
        progressDialog2.setMessage(("إسم الملف : " + ((Object) sb)) + "\nحجم الملف : جاري حساب حجم الملف");
        this.progressDialog.setMax(100);
        this.progressDialog.setProgressStyle(1);
        this.progressDialog.setCancelable(false);
        this.progressDialog.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.TopicsSolutionsActivity$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                TopicsSolutionsActivity.lambda$onCreateDialog$16(dialogInterface, i2);
            }
        });
        try {
            handler.removeCallbacks(this.time_wait_out);
            this.count_time_wait = -1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        close_dialog();
        getWindow().addFlags(128);
        this.progressDialog.show();
        return this.progressDialog;
    }

    /* renamed from: lambda$onCreateDialog$15$com-neptunesoft-bacdz-TopicsSolutionsActivity, reason: not valid java name */
    /* synthetic */ void m766x6a644898(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.progressDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    static /* synthetic */ void lambda$onCreateDialog$16(DialogInterface dialogInterface, int i) {
        isCancelled = true;
        dialogInterface.dismiss();
    }

    public void close_dialog() {
        AlertDialog alertDialog = this.dialog_download_files;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.dialog_download_files.cancel();
        }
        AlertDialog alertDialog2 = this.dialog_internet_low;
        if (alertDialog2 != null && alertDialog2.isShowing()) {
            this.dialog_internet_low.cancel();
        }
        AlertDialog alertDialog3 = this.dialog_nointernet;
        if (alertDialog3 != null && alertDialog3.isShowing()) {
            this.dialog_nointernet.cancel();
        }
        ProgressDialog progressDialog = this.dialog_wait_check;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.dialog_wait_check.cancel();
        }
        AlertDialog alertDialog4 = this.dialog_connect_internet;
        if (alertDialog4 != null && alertDialog4.isShowing()) {
            this.dialog_connect_internet.cancel();
        }
        ProgressDialog progressDialog2 = this.progressDialog;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            this.progressDialog.cancel();
        }
        getWindow().clearFlags(128);
    }

    public void delete_file(String FILE_NAME) {
        File file = new File(getFilesDir(), FILE_NAME);
        if (file.exists()) {
            file.delete();
        }
    }

    public String read_file_download(String file_name_read) {
        FileInputStream fileInputStream = null;
        try {
            try {
                fileInputStream = openFileInput(file_name_read);
                String readLine = new BufferedReader(new InputStreamReader(fileInputStream)).readLine();
                if (fileInputStream == null) {
                    return readLine;
                }
                try {
                    fileInputStream.close();
                    return readLine;
                } catch (IOException e) {
                    e.printStackTrace();
                    return readLine;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                return "";
            }
        } catch (Throwable th) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    public void openContent(String fileName) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) PdfGalleryActivity.class);
        intent.putExtra("ViewType", "assets");
        if (files_exist(fileName)) {
            PdfGalleryActivity.setDir_file(fileName);
            startActivity(intent);
        } else if (test_connection()) {
            download_files(fileName);
        } else {
            connect_internet();
        }
    }

    public class DownloadFileAsync extends AsyncTask<String, String, String> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        public DownloadFileAsync() {
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            try {
                TopicsSolutionsActivity.handler.removeCallbacks(TopicsSolutionsActivity.this.time_wait_out);
                TopicsSolutionsActivity.this.count_time_wait = -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                TopicsSolutionsActivity.this.dialog_wait_check.cancel();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (TopicsSolutionsActivity.this.progressDialog != null) {
                TopicsSolutionsActivity.this.progressDialog.setProgress(0);
            }
            TopicsSolutionsActivity.this.showDialog(1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(String s) {
            TopicsSolutionsActivity.handler.postDelayed(TopicsSolutionsActivity.this.buffer_onPostExecute, 100L);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onProgressUpdate(String... values) {
            super.onProgressUpdate((Object[]) values);
            Log.d("ANDRO_ASYNC", values[0]);
            TopicsSolutionsActivity.this.progressDialog.setProgress(Integer.parseInt(values[0]));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public String doInBackground(String... strings) {
            try {
                TopicsSolutionsActivity.this.wakeLock.acquire(500000L);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                URL url = new URL(strings[0]);
                int contentLength = url.openConnection().getContentLength();
                TopicsSolutionsActivity.this.lengthofFileDownload = contentLength;
                publishProgress("0");
                String format = new DecimalFormat("##.##").format(r0.getContentLength() / 1048576.0f);
                StringBuilder sb = new StringBuilder();
                if (TopicsSolutionsActivity.file_Name.length() < 16) {
                    sb = new StringBuilder(TopicsSolutionsActivity.file_Name);
                } else {
                    for (int i = 0; i < 12; i++) {
                        sb.append(TopicsSolutionsActivity.file_Name.charAt(i));
                    }
                    sb.insert(0, "...");
                }
                String str = "إسم الملف : " + ((Object) sb);
                String str2 = "حجم الملف : " + format + " م.ب";
                try {
                    TopicsSolutionsActivity.this.progressDialog.setMessage(str + IOUtils.LINE_SEPARATOR_UNIX + str2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                TopicsSolutionsActivity.this.progressDialog.setMax(100);
                TopicsSolutionsActivity.handler.postDelayed(TopicsSolutionsActivity.this.write_file_download, 0L);
                FileOutputStream openFileOutput = TopicsSolutionsActivity.this.openFileOutput(TopicsSolutionsActivity.file_Name, 0);
                Log.d("ANDRO_ASYNC", "Length of file: " + contentLength);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
                FileOutputStream fileOutputStream = new FileOutputStream(openFileOutput.getFD());
                byte[] bArr = new byte[1024];
                long j = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1 || TopicsSolutionsActivity.isCancelled) {
                        break;
                    }
                    j += read;
                    publishProgress("" + ((int) ((100 * j) / contentLength)));
                    fileOutputStream.write(bArr, 0, read);
                }
                if (TopicsSolutionsActivity.isCancelled) {
                    cancel(true);
                    TopicsSolutionsActivity.handler.postDelayed(TopicsSolutionsActivity.this.delete_file, 0L);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                bufferedInputStream.close();
                openFileOutput.close();
                TopicsSolutionsActivity.handler.postDelayed(TopicsSolutionsActivity.this.write_file_download_null, 0L);
            } catch (Exception e3) {
                TopicsSolutionsActivity.this.dismissDialog(1);
                e3.printStackTrace();
            }
            try {
                TopicsSolutionsActivity.this.wakeLock.release();
                return null;
            } catch (Exception e4) {
                e4.printStackTrace();
                return null;
            }
        }
    }
}
