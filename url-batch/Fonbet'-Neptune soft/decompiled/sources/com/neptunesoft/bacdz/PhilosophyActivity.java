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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.neptunesoft.bacdz.adapter.AdapterTutorials;
import com.neptunesoft.bacdz.classobjects.Tutorials;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;

/* loaded from: classes4.dex */
public class PhilosophyActivity extends AppCompatActivity {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DIALOG_DOWNLOAD_PROGRESSE = 1;
    static AdapterTutorials adapterTutorials;
    public static String file_Name;
    public static Handler handler = new Handler();
    static PhilosophyActivity instance;
    static boolean isCancelled;
    public static List<Object> list;
    static RecyclerView philoRecyclerView;
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
    PowerManager.WakeLock wakeLock;
    private final String[] cours_philosophy = {"sciences_philosophy_1.pdf", "sciences_philosophy_2.pdf", "sciences_philosophy_3.pdf", "sciences_philosophy_4.pdf", "sciences_philosophy_5.pdf", "sciences_philosophy_6.pdf", "sciences_philosophy_7.pdf", "sciences_philosophy_8.pdf", "sciences_philosophy_9.pdf", "sciences_philosophy_10.pdf", "sciences_philosophy_11.pdf", "sciences_philosophy_12.pdf", "sciences_philosophy_13.pdf", "sciences_philosophy_14.pdf", "sciences_philosophy_15.pdf", "sciences_philosophy_16.pdf", "sciences_philosophy_17.pdf", "sciences_philosophy_18.pdf", "sciences_philosophy_19.pdf", "sciences_philosophy_20.pdf", "sciences_philosophy_21.pdf", "sciences_philosophy_22.pdf", "sciences_philosophy_23.pdf", "sciences_philosophy_24.pdf", "sciences_philosophy_25.pdf", "sciences_philosophy_26.pdf", "sciences_philosophy_27.pdf", "sciences_philosophy_28.pdf", "sciences_philosophy_29.pdf", "sciences_philosophy_30.pdf", "sciences_philosophy_31.pdf", "sciences_philosophy_32.pdf", "sciences_philosophy_33.pdf", "sciences_philosophy_34.pdf", "sciences_philosophy_35.pdf", "sciences_philosophy_36.pdf", "sciences_philosophy_37.pdf", "sciences_philosophy_38.pdf", "sciences_philosophy_39.pdf", "sciences_philosophy_40.pdf", "sciences_philosophy_41.pdf", "sciences_philosophy_42.pdf", "sciences_philosophy_43.pdf", "sciences_philosophy_44.pdf", "sciences_philosophy_45.pdf", "sciences_philosophy_46.pdf", "sciences_philosophy_47.pdf", "sciences_philosophy_48.pdf", "sciences_philosophy_49.pdf", "sciences_philosophy_50.pdf", "sciences_philosophy_51.pdf", "sciences_philosophy_52.pdf"};
    int count_time_wait = -1;
    Runnable time_wait_out = new Runnable() { // from class: com.neptunesoft.bacdz.PhilosophyActivity.3
        @Override // java.lang.Runnable
        public void run() {
            if (PhilosophyActivity.this.count_time_wait < 15) {
                PhilosophyActivity.this.count_time_wait++;
                PhilosophyActivity.handler.postDelayed(PhilosophyActivity.this.time_wait_out, 1000L);
                return;
            }
            if (!PhilosophyActivity.this.test_connection()) {
                PhilosophyActivity.this.no_connection();
            } else if (!PhilosophyActivity.this.ad_showing) {
                PhilosophyActivity.this.connection_low();
            }
            PhilosophyActivity.this.count_time_wait = -1;
            PhilosophyActivity.this.getWindow().clearFlags(128);
            PhilosophyActivity.handler.removeCallbacks(PhilosophyActivity.this.time_wait_out);
        }
    };
    Runnable buffer_onPostExecute = new Runnable() { // from class: com.neptunesoft.bacdz.PhilosophyActivity.4
        @Override // java.lang.Runnable
        public void run() {
            if (PhilosophyActivity.this.progressDialog != null) {
                PhilosophyActivity.this.progressDialog.setProgress(0);
            }
            PhilosophyActivity.this.write_file_download("file_download_philo.txt", "");
            String read_file_download = PhilosophyActivity.this.read_file_download("file_download_philo.txt");
            if (read_file_download != null) {
                PhilosophyActivity.this.delete_file(read_file_download);
                PhilosophyActivity.this.write_file_download("file_download_philo.txt", "");
            }
            try {
                PhilosophyActivity.handler.removeCallbacks(PhilosophyActivity.this.time_wait_out);
                PhilosophyActivity.this.count_time_wait = -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                PhilosophyActivity.this.close_dialog();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (new File(PhilosophyActivity.this.getFilesDir().getAbsoluteFile() + "/" + PhilosophyActivity.file_Name).length() == PhilosophyActivity.this.lengthofFileDownload) {
                AdapterTutorials.changePhilosophy();
                Toast.makeText(PhilosophyActivity.this, "تم تحميل الملف بنجاح.", 1).show();
            } else {
                PhilosophyActivity.this.delete_file(PhilosophyActivity.file_Name);
                Toast.makeText(PhilosophyActivity.this, "تعذر عملية تحميل الملف '" + PhilosophyActivity.file_Name + "' تحقق من إتصال الجهاز بالشبكة !.", 1).show();
            }
            PhilosophyActivity.this.dismissDialog(1);
            PhilosophyActivity.this.getWindow().clearFlags(128);
            PhilosophyActivity.handler.removeCallbacks(PhilosophyActivity.this.buffer_onPostExecute);
        }
    };
    Runnable write_file_download = new Runnable() { // from class: com.neptunesoft.bacdz.PhilosophyActivity.5
        @Override // java.lang.Runnable
        public void run() {
            PhilosophyActivity.this.write_file_download("file_download_philo.txt", PhilosophyActivity.file_Name);
            PhilosophyActivity.handler.removeCallbacks(PhilosophyActivity.this.write_file_download);
        }
    };
    Runnable delete_file = new Runnable() { // from class: com.neptunesoft.bacdz.PhilosophyActivity.6
        @Override // java.lang.Runnable
        public void run() {
            if (PhilosophyActivity.this.files_exist(PhilosophyActivity.file_Name)) {
                PhilosophyActivity.this.delete_file(PhilosophyActivity.file_Name);
            }
            PhilosophyActivity.this.write_file_download("file_download_philo.txt", "");
            PhilosophyActivity.handler.removeCallbacks(PhilosophyActivity.this.delete_file);
        }
    };
    Runnable write_file_download_null = new Runnable() { // from class: com.neptunesoft.bacdz.PhilosophyActivity.7
        @Override // java.lang.Runnable
        public void run() {
            PhilosophyActivity.this.write_file_download("file_download_philo.txt", "");
            PhilosophyActivity.handler.removeCallbacks(PhilosophyActivity.this.write_file_download_null);
        }
    };

    public static PhilosophyActivity getInstance() {
        return instance;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;
        setContentView(R.layout.activity_philosophy);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), new OnApplyWindowInsetsListener() { // from class: com.neptunesoft.bacdz.PhilosophyActivity$$ExternalSyntheticLambda2
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return PhilosophyActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        String read_file_download = read_file_download("file_download_philo.txt");
        if (read_file_download != null) {
            delete_file(read_file_download);
            write_file_download("file_download_philo.txt", "");
        }
        MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: com.neptunesoft.bacdz.PhilosophyActivity$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public final void onInitializationComplete(InitializationStatus initializationStatus) {
                PhilosophyActivity.this.m702lambda$onCreate$1$comneptunesoftbacdzPhilosophyActivity(initializationStatus);
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.philoRecyclerView);
        philoRecyclerView = recyclerView;
        recyclerView.setHasFixedSize(false);
        philoRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList();
        refreshRecyclerView();
        AdapterTutorials adapterTutorials2 = new AdapterTutorials(list, "philosophy");
        adapterTutorials = adapterTutorials2;
        philoRecyclerView.setAdapter(adapterTutorials2);
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

    /* renamed from: lambda$onCreate$1$com-neptunesoft-bacdz-PhilosophyActivity, reason: not valid java name */
    /* synthetic */ void m702lambda$onCreate$1$comneptunesoftbacdzPhilosophyActivity(InitializationStatus initializationStatus) {
        Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
        for (String str : adapterStatusMap.keySet()) {
            AdapterStatus adapterStatus = adapterStatusMap.get(str);
            Log.d("MyApp", String.format("Adapter name: %s, Description: %s, Latency: %d", str, adapterStatus.getDescription(), Integer.valueOf(adapterStatus.getLatency())));
        }
        loadAdMobInterstitialAds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAdMobInterstitialAds() {
        InterstitialAd.load(this, getString(R.string.Interstitial_UnitId), new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: com.neptunesoft.bacdz.PhilosophyActivity.1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd interstitialAd) {
                PhilosophyActivity.this.mInterstitialAd = interstitialAd;
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                PhilosophyActivity.this.mInterstitialAd = null;
            }
        });
    }

    public void showInterstitialAds(final String url) {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(this);
            this.mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.neptunesoft.bacdz.PhilosophyActivity.2
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    PhilosophyActivity.this.ad_showing = true;
                    PhilosophyActivity.this.mInterstitialAd = null;
                    PhilosophyActivity.this.loadAdMobInterstitialAds();
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    PhilosophyActivity.this.ad_showing = false;
                    PhilosophyActivity.this.download(url);
                }
            });
        } else {
            download(url);
            loadAdMobInterstitialAds();
        }
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int id) {
        if (id != 1) {
            return null;
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.progressDialog = progressDialog;
        progressDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.PhilosophyActivity$$ExternalSyntheticLambda13
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PhilosophyActivity.this.m703lambda$onCreateDialog$2$comneptunesoftbacdzPhilosophyActivity(dialogInterface);
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
        this.progressDialog.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.PhilosophyActivity$$ExternalSyntheticLambda14
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                PhilosophyActivity.lambda$onCreateDialog$3(dialogInterface, i2);
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

    /* renamed from: lambda$onCreateDialog$2$com-neptunesoft-bacdz-PhilosophyActivity, reason: not valid java name */
    /* synthetic */ void m703lambda$onCreateDialog$2$comneptunesoftbacdzPhilosophyActivity(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.progressDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    static /* synthetic */ void lambda$onCreateDialog$3(DialogInterface dialogInterface, int i) {
        isCancelled = true;
        dialogInterface.dismiss();
    }

    private void refreshRecyclerView() {
        String str;
        String str2;
        String str3;
        String str4;
        if (SplashScreen.darkmode) {
            if (files_exist(this.cours_philosophy[0])) {
                str3 = "2 مقارنة بين انطباق الفكر مع نفسة و انطباق الفكر مع الواقع";
                str4 = "2 مقارنة بين الاستدلال المباشر و الاستدلال الغير المباشر";
                list.add(new Tutorials("ملخص مادة الفلسفة", R.drawable.ic_plus_dark));
            } else {
                str3 = "2 مقارنة بين انطباق الفكر مع نفسة و انطباق الفكر مع الواقع";
                str4 = "2 مقارنة بين الاستدلال المباشر و الاستدلال الغير المباشر";
                list.add(new Tutorials("ملخص مادة الفلسفة", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[1])) {
                list.add(new Tutorials("1 المقارنة بين السؤال العلمي والسؤال الفلسفي", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("1 المقارنة بين السؤال العلمي والسؤال الفلسفي", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[2])) {
                list.add(new Tutorials("1 المقارنة بين السؤال و المشكلة", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("1 المقارنة بين السؤال و المشكلة", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[3])) {
                list.add(new Tutorials("1 مقال المقارنة بين المشكلة و الاشكالية", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("1 مقال المقارنة بين المشكلة و الاشكالية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[4])) {
                list.add(new Tutorials("1 مقال المقارنة بين المشكل الفلسفي و الاشكال الفلسفي", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("1 مقال المقارنة بين المشكل الفلسفي و الاشكال الفلسفي", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[5])) {
                list.add(new Tutorials("1 مقال المقارنة بين الدهشة و الاحراج في السؤال الفلسفي", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("1 مقال المقارنة بين الدهشة و الاحراج في السؤال الفلسفي", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[6])) {
                list.add(new Tutorials("1 مقال جدلي هل لكل سؤال جواب بالضرورة ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("1 مقال جدلي هل لكل سؤال جواب بالضرورة ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[7])) {
                list.add(new Tutorials("1 مقال جدلي هل تقدم العلم سيعود سلبا على الفلسفة ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("1 مقال جدلي هل تقدم العلم سيعود سلبا على الفلسفة ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[8])) {
                list.add(new Tutorials("1 مقال جدلي التهجم على الفلسفة هو في الحقيقة تفلسف", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("1 مقال جدلي التهجم على الفلسفة هو في الحقيقة تفلسف", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[9])) {
                list.add(new Tutorials("1 مقال استقصاء عهد الفلسفة قد ولى و لا جدوى من دراستها في عصر التطور التكنولوجي", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("1 مقال استقصاء عهد الفلسفة قد ولى و لا جدوى من دراستها في عصر التطور التكنولوجي", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[10])) {
                list.add(new Tutorials("2 مقارنة بين الاستدلال الصوري ( الاستنتاج ) و الاستدالل الاستقرائي ( الاستقراء )", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("2 مقارنة بين الاستدلال الصوري ( الاستنتاج ) و الاستدالل الاستقرائي ( الاستقراء )", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[11])) {
                list.add(new Tutorials("2 مقارنة بين المفهوم و الماصدق", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("2 مقارنة بين المفهوم و الماصدق", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[12])) {
                list.add(new Tutorials(str4, R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials(str4, R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[13])) {
                list.add(new Tutorials(str3, R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials(str3, R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[14])) {
                list.add(new Tutorials("2 مقال جدلي انطباق الفكر مع نفسة و انطباقه مع الواقع", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("2 مقال جدلي انطباق الفكر مع نفسة و انطباقه مع الواقع", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[15])) {
                list.add(new Tutorials("2 مقال جدلي هل المنطق الصوري مجرد تحصيل حاصل", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("2 مقال جدلي هل المنطق الصوري مجرد تحصيل حاصل", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[16])) {
                list.add(new Tutorials("2 مقال جدلي هل يمكن الاستغناء عن الفرض العلمي ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("2 مقال جدلي هل يمكن الاستغناء عن الفرض العلمي ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[17])) {
                list.add(new Tutorials("2 مقال جدلي هل الطبيعة تخضع لمبدأ الحتمية خضوعا كليا ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("2 مقال جدلي هل الطبيعة تخضع لمبدأ الحتمية خضوعا كليا ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[18])) {
                list.add(new Tutorials("2 مقالة استقصائية ان المنطق الصوري يعصم الفكر من الخطأ", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("2 مقالة استقصائية ان المنطق الصوري يعصم الفكر من الخطأ", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[19])) {
                list.add(new Tutorials("2 مقالة استقصائية ان التجريب دون فكرة سابقة غير ممكن", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("2 مقالة استقصائية ان التجريب دون فكرة سابقة غير ممكن", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[20])) {
                list.add(new Tutorials("2 مقالة استقصائية ان تطابق الفكر مع نفسه شرط كاف لعدم وقوعه في الخطأ", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("2 مقالة استقصائية ان تطابق الفكر مع نفسه شرط كاف لعدم وقوعه في الخطأ", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[21])) {
                list.add(new Tutorials("2 مقالة استقصائية لكي يصل الفكر إلى الانطباق مع الواقع لابد أن يأخذ بأحكام مسبقة غير مؤكدة علميا", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("2 مقالة استقصائية لكي يصل الفكر إلى الانطباق مع الواقع لابد أن يأخذ بأحكام مسبقة غير مؤكدة علميا", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[22])) {
                list.add(new Tutorials("3 مقارنة بين الرياضيات الكلاسيكية والرياضيات المعاصرة", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقارنة بين الرياضيات الكلاسيكية والرياضيات المعاصرة", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[23])) {
                list.add(new Tutorials("3 مقارنة بين الرياضيات و المنطق", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقارنة بين الرياضيات و المنطق", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[24])) {
                list.add(new Tutorials("3 مقارنة بين الرياضيات و العلوم التجريبية", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقارنة بين الرياضيات و العلوم التجريبية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[25])) {
                list.add(new Tutorials("3 مقارنة بين الحقيقة الرياضية عن الحقيقة التجريبية", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقارنة بين الحقيقة الرياضية عن الحقيقة التجريبية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[26])) {
                list.add(new Tutorials("3 مقال جدلي هل يمكن إرجاع الرياضيات إلى أصول منطقية ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقال جدلي هل يمكن إرجاع الرياضيات إلى أصول منطقية ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[27])) {
                list.add(new Tutorials("3 مقال جدلي هل أصل الرياضيات العقل أم التجربة ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقال جدلي هل أصل الرياضيات العقل أم التجربة ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[28])) {
                list.add(new Tutorials("3 مقال جدلي هل المفاهيم الرياضية مطلقة في اليقين ام نسبية ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقال جدلي هل المفاهيم الرياضية مطلقة في اليقين ام نسبية ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[29])) {
                list.add(new Tutorials("3 مقال هل معيار الحقيقة في الرياضيات يكمن في البداهة والوضوح أم في اتساق النتائج ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقال هل معيار الحقيقة في الرياضيات يكمن في البداهة والوضوح أم في اتساق النتائج ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[30])) {
                list.add(new Tutorials("3 مقال جدلي هل اليقين في نتائج العلوم قد بلغ درجة اليقين الرياضي ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقال جدلي هل اليقين في نتائج العلوم قد بلغ درجة اليقين الرياضي ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[31])) {
                list.add(new Tutorials("3 مقال ان المفاهيم الرياضية أصلها تجريبي", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقال ان المفاهيم الرياضية أصلها تجريبي", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[32])) {
                list.add(new Tutorials("3 مقال استقصاء أن الحقيقة الرياضية صارت حقيقة منطقية بحتة", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقال استقصاء أن الحقيقة الرياضية صارت حقيقة منطقية بحتة", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[33])) {
                list.add(new Tutorials("3 مقال استقصاء المعاني الرياضية فطرية وبالتالي مصدرها العقل", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقال استقصاء المعاني الرياضية فطرية وبالتالي مصدرها العقل", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[34])) {
                list.add(new Tutorials("3 مقارنة بين الملاحظة العادية و الملاحظة العلمية", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقارنة بين الملاحظة العادية و الملاحظة العلمية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[35])) {
                list.add(new Tutorials("3 مقال جدلي هل يمكن إخضاع المادة الحية للمنهج التجريبي على غرار المادة الجامدة ... ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقال جدلي هل يمكن إخضاع المادة الحية للمنهج التجريبي على غرار المادة الجامدة ... ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[36])) {
                list.add(new Tutorials("3 مقال جدلي هل يمكن تفسير الظواهر الحية تفسيرا غائيا ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقال جدلي هل يمكن تفسير الظواهر الحية تفسيرا غائيا ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[37])) {
                list.add(new Tutorials("3 مقال استقصاء هل يمكن تطبيق المنهج التجريبي على الظواهر الحية", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقال استقصاء هل يمكن تطبيق المنهج التجريبي على الظواهر الحية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[38])) {
                list.add(new Tutorials("3 مقال استقصاء البيولوجيا التحليلية ( التشريحية ) تقضي عمليا على موضوع دراستها", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقال استقصاء البيولوجيا التحليلية ( التشريحية ) تقضي عمليا على موضوع دراستها", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[39])) {
                list.add(new Tutorials("3 مقال جدلي هل يمكن إخضاع الظاهرة الإنسانية للتجريب ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقال جدلي هل يمكن إخضاع الظاهرة الإنسانية للتجريب ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[40])) {
                list.add(new Tutorials("3 مقال جدلي هل لتاريخ مقعدا بين العلوم الأخرى ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقال جدلي هل لتاريخ مقعدا بين العلوم الأخرى ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[41])) {
                list.add(new Tutorials("3 مقال جدلي هل تعتبر التجربة المقياس الأساسي لعملية العلم ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("3 مقال جدلي هل تعتبر التجربة المقياس الأساسي لعملية العلم ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[42])) {
                list.add(new Tutorials("4 مقال استقصاء من الصعب تطبيق المنهج التجريبي على الظواهر الإنسانية", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("4 مقال استقصاء من الصعب تطبيق المنهج التجريبي على الظواهر الإنسانية", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[43])) {
                list.add(new Tutorials("4 مقال جدلي هل الشعور بالأنا يتوقف على الغير ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("4 مقال جدلي هل الشعور بالأنا يتوقف على الغير ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[44])) {
                list.add(new Tutorials("4 مقال استقصاء معرفة الذات تتأسس على التواصل مع الغير", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("4 مقال استقصاء معرفة الذات تتأسس على التواصل مع الغير", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[45])) {
                list.add(new Tutorials("4 مقال جدلي هل الإنسان مسؤول عن أفعاله في كل الأحوال ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("4 مقال جدلي هل الإنسان مسؤول عن أفعاله في كل الأحوال ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[46])) {
                list.add(new Tutorials("4 مقال جدلي هل الحرية مجرد وهم ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("4 مقال جدلي هل الحرية مجرد وهم ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[47])) {
                list.add(new Tutorials("4 مقال جدلي هل الحرية شرط تأسيس المسؤولية ام المسؤولية شرط وجود الحرية ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("4 مقال جدلي هل الحرية شرط تأسيس المسؤولية ام المسؤولية شرط وجود الحرية ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[48])) {
                list.add(new Tutorials("4 مقال جدلي هل المجرم هو المسؤول الوحيد عن جرائمه ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("4 مقال جدلي هل المجرم هو المسؤول الوحيد عن جرائمه ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[49])) {
                list.add(new Tutorials("4 مقال جدلي هل الحرية مجرد حالة شعورية ام هى ممارسة عملية في الحياة اليومية اساسها التحرر ؟", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("4 مقال جدلي هل الحرية مجرد حالة شعورية ام هى ممارسة عملية في الحياة اليومية اساسها التحرر ؟", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[50])) {
                list.add(new Tutorials("4 مقال استقصاء قيل أن الإنسان حر حرية مطلقة دافع", R.drawable.ic_plus_dark));
            } else {
                list.add(new Tutorials("4 مقال استقصاء قيل أن الإنسان حر حرية مطلقة دافع", R.drawable.ic_download_dark));
            }
            if (files_exist(this.cours_philosophy[51])) {
                list.add(new Tutorials("4 مقال استقصاء قيل ان الحتمية أساس الحرية أثبت بالبرهان صحة هذه الأطروحة اثبت", R.drawable.ic_plus_dark));
                return;
            } else {
                list.add(new Tutorials("4 مقال استقصاء قيل ان الحتمية أساس الحرية أثبت بالبرهان صحة هذه الأطروحة اثبت", R.drawable.ic_download_dark));
                return;
            }
        }
        if (files_exist(this.cours_philosophy[0])) {
            str2 = "2 مقارنة بين انطباق الفكر مع نفسة و انطباق الفكر مع الواقع";
            str = "2 مقارنة بين الاستدلال المباشر و الاستدلال الغير المباشر";
            list.add(new Tutorials("ملخص مادة الفلسفة", R.drawable.ic_plus));
        } else {
            str = "2 مقارنة بين الاستدلال المباشر و الاستدلال الغير المباشر";
            str2 = "2 مقارنة بين انطباق الفكر مع نفسة و انطباق الفكر مع الواقع";
            list.add(new Tutorials("ملخص مادة الفلسفة", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[1])) {
            list.add(new Tutorials("1 المقارنة بين السؤال العلمي والسؤال الفلسفي", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("1 المقارنة بين السؤال العلمي والسؤال الفلسفي", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[2])) {
            list.add(new Tutorials("1 المقارنة بين السؤال و المشكلة", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("1 المقارنة بين السؤال و المشكلة", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[3])) {
            list.add(new Tutorials("1 مقال المقارنة بين المشكلة و الاشكالية", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("1 مقال المقارنة بين المشكلة و الاشكالية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[4])) {
            list.add(new Tutorials("1 مقال المقارنة بين المشكل الفلسفي و الاشكال الفلسفي", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("1 مقال المقارنة بين المشكل الفلسفي و الاشكال الفلسفي", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[5])) {
            list.add(new Tutorials("1 مقال المقارنة بين الدهشة و الاحراج في السؤال الفلسفي", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("1 مقال المقارنة بين الدهشة و الاحراج في السؤال الفلسفي", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[6])) {
            list.add(new Tutorials("1 مقال جدلي هل لكل سؤال جواب بالضرورة ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("1 مقال جدلي هل لكل سؤال جواب بالضرورة ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[7])) {
            list.add(new Tutorials("1 مقال جدلي هل تقدم العلم سيعود سلبا على الفلسفة ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("1 مقال جدلي هل تقدم العلم سيعود سلبا على الفلسفة ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[8])) {
            list.add(new Tutorials("1 مقال جدلي التهجم على الفلسفة هو في الحقيقة تفلسف", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("1 مقال جدلي التهجم على الفلسفة هو في الحقيقة تفلسف", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[9])) {
            list.add(new Tutorials("1 مقال استقصاء عهد الفلسفة قد ولى و لا جدوى من دراستها في عصر التطور التكنولوجي", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("1 مقال استقصاء عهد الفلسفة قد ولى و لا جدوى من دراستها في عصر التطور التكنولوجي", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[10])) {
            list.add(new Tutorials("2 مقارنة بين الاستدلال الصوري ( الاستنتاج ) و الاستدالل الاستقرائي ( الاستقراء )", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("2 مقارنة بين الاستدلال الصوري ( الاستنتاج ) و الاستدالل الاستقرائي ( الاستقراء )", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[11])) {
            list.add(new Tutorials("2 مقارنة بين المفهوم و الماصدق", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("2 مقارنة بين المفهوم و الماصدق", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[12])) {
            list.add(new Tutorials(str, R.drawable.ic_plus));
        } else {
            list.add(new Tutorials(str, R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[13])) {
            list.add(new Tutorials(str2, R.drawable.ic_plus));
        } else {
            list.add(new Tutorials(str2, R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[14])) {
            list.add(new Tutorials("2 مقال جدلي انطباق الفكر مع نفسة و انطباقه مع الواقع", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("2 مقال جدلي انطباق الفكر مع نفسة و انطباقه مع الواقع", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[15])) {
            list.add(new Tutorials("2 مقال جدلي هل المنطق الصوري مجرد تحصيل حاصل", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("2 مقال جدلي هل المنطق الصوري مجرد تحصيل حاصل", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[16])) {
            list.add(new Tutorials("2 مقال جدلي هل يمكن الاستغناء عن الفرض العلمي ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("2 مقال جدلي هل يمكن الاستغناء عن الفرض العلمي ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[17])) {
            list.add(new Tutorials("2 مقال جدلي هل الطبيعة تخضع لمبدأ الحتمية خضوعا كليا ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("2 مقال جدلي هل الطبيعة تخضع لمبدأ الحتمية خضوعا كليا ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[18])) {
            list.add(new Tutorials("2 مقالة استقصائية ان المنطق الصوري يعصم الفكر من الخطأ", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("2 مقالة استقصائية ان المنطق الصوري يعصم الفكر من الخطأ", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[19])) {
            list.add(new Tutorials("2 مقالة استقصائية ان التجريب دون فكرة سابقة غير ممكن", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("2 مقالة استقصائية ان التجريب دون فكرة سابقة غير ممكن", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[20])) {
            list.add(new Tutorials("2 مقالة استقصائية ان تطابق الفكر مع نفسه شرط كاف لعدم وقوعه في الخطأ", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("2 مقالة استقصائية ان تطابق الفكر مع نفسه شرط كاف لعدم وقوعه في الخطأ", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[21])) {
            list.add(new Tutorials("2 مقالة استقصائية لكي يصل الفكر إلى الانطباق مع الواقع لابد أن يأخذ بأحكام مسبقة غير مؤكدة علميا", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("2 مقالة استقصائية لكي يصل الفكر إلى الانطباق مع الواقع لابد أن يأخذ بأحكام مسبقة غير مؤكدة علميا", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[22])) {
            list.add(new Tutorials("3 مقارنة بين الرياضيات الكلاسيكية والرياضيات المعاصرة", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقارنة بين الرياضيات الكلاسيكية والرياضيات المعاصرة", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[23])) {
            list.add(new Tutorials("3 مقارنة بين الرياضيات و المنطق", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقارنة بين الرياضيات و المنطق", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[24])) {
            list.add(new Tutorials("3 مقارنة بين الرياضيات و العلوم التجريبية", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقارنة بين الرياضيات و العلوم التجريبية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[25])) {
            list.add(new Tutorials("3 مقارنة بين الحقيقة الرياضية عن الحقيقة التجريبية", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقارنة بين الحقيقة الرياضية عن الحقيقة التجريبية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[26])) {
            list.add(new Tutorials("3 مقال جدلي هل يمكن إرجاع الرياضيات إلى أصول منطقية ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقال جدلي هل يمكن إرجاع الرياضيات إلى أصول منطقية ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[27])) {
            list.add(new Tutorials("3 مقال جدلي هل أصل الرياضيات العقل أم التجربة ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقال جدلي هل أصل الرياضيات العقل أم التجربة ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[28])) {
            list.add(new Tutorials("3 مقال جدلي هل المفاهيم الرياضية مطلقة في اليقين ام نسبية ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقال جدلي هل المفاهيم الرياضية مطلقة في اليقين ام نسبية ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[29])) {
            list.add(new Tutorials("3 مقال هل معيار الحقيقة في الرياضيات يكمن في البداهة والوضوح أم في اتساق النتائج ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقال هل معيار الحقيقة في الرياضيات يكمن في البداهة والوضوح أم في اتساق النتائج ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[30])) {
            list.add(new Tutorials("3 مقال جدلي هل اليقين في نتائج العلوم قد بلغ درجة اليقين الرياضي ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقال جدلي هل اليقين في نتائج العلوم قد بلغ درجة اليقين الرياضي ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[31])) {
            list.add(new Tutorials("3 مقال ان المفاهيم الرياضية أصلها تجريبي", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقال ان المفاهيم الرياضية أصلها تجريبي", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[32])) {
            list.add(new Tutorials("3 مقال استقصاء أن الحقيقة الرياضية صارت حقيقة منطقية بحتة", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقال استقصاء أن الحقيقة الرياضية صارت حقيقة منطقية بحتة", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[33])) {
            list.add(new Tutorials("3 مقال استقصاء المعاني الرياضية فطرية وبالتالي مصدرها العقل", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقال استقصاء المعاني الرياضية فطرية وبالتالي مصدرها العقل", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[34])) {
            list.add(new Tutorials("3 مقارنة بين الملاحظة العادية و الملاحظة العلمية", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقارنة بين الملاحظة العادية و الملاحظة العلمية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[35])) {
            list.add(new Tutorials("3 مقال جدلي هل يمكن إخضاع المادة الحية للمنهج التجريبي على غرار المادة الجامدة ... ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقال جدلي هل يمكن إخضاع المادة الحية للمنهج التجريبي على غرار المادة الجامدة ... ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[36])) {
            list.add(new Tutorials("3 مقال جدلي هل يمكن تفسير الظواهر الحية تفسيرا غائيا ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقال جدلي هل يمكن تفسير الظواهر الحية تفسيرا غائيا ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[37])) {
            list.add(new Tutorials("3 مقال استقصاء هل يمكن تطبيق المنهج التجريبي على الظواهر الحية", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقال استقصاء هل يمكن تطبيق المنهج التجريبي على الظواهر الحية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[38])) {
            list.add(new Tutorials("3 مقال استقصاء البيولوجيا التحليلية ( التشريحية ) تقضي عمليا على موضوع دراستها", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقال استقصاء البيولوجيا التحليلية ( التشريحية ) تقضي عمليا على موضوع دراستها", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[39])) {
            list.add(new Tutorials("3 مقال جدلي هل يمكن إخضاع الظاهرة الإنسانية للتجريب ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقال جدلي هل يمكن إخضاع الظاهرة الإنسانية للتجريب ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[40])) {
            list.add(new Tutorials("3 مقال جدلي هل لتاريخ مقعدا بين العلوم الأخرى ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقال جدلي هل لتاريخ مقعدا بين العلوم الأخرى ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[41])) {
            list.add(new Tutorials("3 مقال جدلي هل تعتبر التجربة المقياس الأساسي لعملية العلم ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("3 مقال جدلي هل تعتبر التجربة المقياس الأساسي لعملية العلم ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[42])) {
            list.add(new Tutorials("4 مقال استقصاء من الصعب تطبيق المنهج التجريبي على الظواهر الإنسانية", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("4 مقال استقصاء من الصعب تطبيق المنهج التجريبي على الظواهر الإنسانية", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[43])) {
            list.add(new Tutorials("4 مقال جدلي هل الشعور بالأنا يتوقف على الغير ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("4 مقال جدلي هل الشعور بالأنا يتوقف على الغير ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[44])) {
            list.add(new Tutorials("4 مقال استقصاء معرفة الذات تتأسس على التواصل مع الغير", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("4 مقال استقصاء معرفة الذات تتأسس على التواصل مع الغير", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[45])) {
            list.add(new Tutorials("4 مقال جدلي هل الإنسان مسؤول عن أفعاله في كل الأحوال ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("4 مقال جدلي هل الإنسان مسؤول عن أفعاله في كل الأحوال ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[46])) {
            list.add(new Tutorials("4 مقال جدلي هل الحرية مجرد وهم ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("4 مقال جدلي هل الحرية مجرد وهم ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[47])) {
            list.add(new Tutorials("4 مقال جدلي هل الحرية شرط تأسيس المسؤولية ام المسؤولية شرط وجود الحرية ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("4 مقال جدلي هل الحرية شرط تأسيس المسؤولية ام المسؤولية شرط وجود الحرية ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[48])) {
            list.add(new Tutorials("4 مقال جدلي هل المجرم هو المسؤول الوحيد عن جرائمه ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("4 مقال جدلي هل المجرم هو المسؤول الوحيد عن جرائمه ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[49])) {
            list.add(new Tutorials("4 مقال جدلي هل الحرية مجرد حالة شعورية ام هى ممارسة عملية في الحياة اليومية اساسها التحرر ؟", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("4 مقال جدلي هل الحرية مجرد حالة شعورية ام هى ممارسة عملية في الحياة اليومية اساسها التحرر ؟", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[50])) {
            list.add(new Tutorials("4 مقال استقصاء قيل أن الإنسان حر حرية مطلقة دافع", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("4 مقال استقصاء قيل أن الإنسان حر حرية مطلقة دافع", R.drawable.ic_download));
        }
        if (files_exist(this.cours_philosophy[51])) {
            list.add(new Tutorials("4 مقال استقصاء قيل ان الحتمية أساس الحرية أثبت بالبرهان صحة هذه الأطروحة اثبت", R.drawable.ic_plus));
        } else {
            list.add(new Tutorials("4 مقال استقصاء قيل ان الحتمية أساس الحرية أثبت بالبرهان صحة هذه الأطروحة اثبت", R.drawable.ic_download));
        }
    }

    public boolean files_exist(String fileName) {
        return new File(getFilesDir(), fileName).exists();
    }

    public void connection_low() {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_internet_low = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.PhilosophyActivity$$ExternalSyntheticLambda11
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PhilosophyActivity.this.m694lambda$connection_low$4$comneptunesoftbacdzPhilosophyActivity(dialogInterface);
            }
        });
        this.dialog_internet_low.setCancelable(false);
        this.dialog_internet_low.setMessage("تعذر عملية الإتصال بالخادم, حاول مرة أخرى !.");
        this.dialog_internet_low.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.PhilosophyActivity$$ExternalSyntheticLambda12
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_internet_low.show();
    }

    /* renamed from: lambda$connection_low$4$com-neptunesoft-bacdz-PhilosophyActivity, reason: not valid java name */
    /* synthetic */ void m694lambda$connection_low$4$comneptunesoftbacdzPhilosophyActivity(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_internet_low.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void no_connection() {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_nointernet = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.PhilosophyActivity$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PhilosophyActivity.this.m701lambda$no_connection$6$comneptunesoftbacdzPhilosophyActivity(dialogInterface);
            }
        });
        this.dialog_nointernet.setCancelable(false);
        this.dialog_nointernet.setMessage("لا يوجد إتصال بالشبكة !.");
        this.dialog_nointernet.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.PhilosophyActivity$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_nointernet.show();
    }

    /* renamed from: lambda$no_connection$6$com-neptunesoft-bacdz-PhilosophyActivity, reason: not valid java name */
    /* synthetic */ void m701lambda$no_connection$6$comneptunesoftbacdzPhilosophyActivity(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_nointernet.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
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

    private void download_files(final String fileName) {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_download_files = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.PhilosophyActivity$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PhilosophyActivity.this.m696lambda$download_files$8$comneptunesoftbacdzPhilosophyActivity(dialogInterface);
            }
        });
        this.dialog_download_files.setCancelable(false);
        this.dialog_download_files.setMessage("هل تريد تحميل الملف ؟.");
        this.dialog_download_files.setButton(-1, "تحميل", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.PhilosophyActivity$$ExternalSyntheticLambda7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                PhilosophyActivity.this.m697lambda$download_files$9$comneptunesoftbacdzPhilosophyActivity(fileName, dialogInterface, i);
            }
        });
        this.dialog_download_files.setButton(-2, "رفض", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.PhilosophyActivity$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                PhilosophyActivity.this.m695xb9acb5af(dialogInterface, i);
            }
        });
        this.dialog_download_files.show();
    }

    /* renamed from: lambda$download_files$8$com-neptunesoft-bacdz-PhilosophyActivity, reason: not valid java name */
    /* synthetic */ void m696lambda$download_files$8$comneptunesoftbacdzPhilosophyActivity(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_download_files.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        this.dialog_download_files.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$download_files$9$com-neptunesoft-bacdz-PhilosophyActivity, reason: not valid java name */
    /* synthetic */ void m697lambda$download_files$9$comneptunesoftbacdzPhilosophyActivity(String str, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (test_connection()) {
            dialog_wait();
            getWindow().addFlags(128);
            geturl_download(str);
            return;
        }
        no_connection();
    }

    /* renamed from: lambda$download_files$10$com-neptunesoft-bacdz-PhilosophyActivity, reason: not valid java name */
    /* synthetic */ void m695xb9acb5af(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        getWindow().clearFlags(128);
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
        file_Name = fileName;
        StorageReference reference = FirebaseStorage.getInstance().getReference();
        this.storageReference = reference;
        this.storageRef = reference.child(fileName);
        write_file_download("file_download_philo.txt", fileName);
        this.storageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener() { // from class: com.neptunesoft.bacdz.PhilosophyActivity$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                PhilosophyActivity.this.m698xda57df22((Uri) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.neptunesoft.bacdz.PhilosophyActivity$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                PhilosophyActivity.this.m700xf0877e7f(exc);
            }
        });
    }

    /* renamed from: lambda$geturl_download$11$com-neptunesoft-bacdz-PhilosophyActivity, reason: not valid java name */
    /* synthetic */ void m698xda57df22(Uri uri) {
        if (this.count_time_wait != -1) {
            showInterstitialAds(uri.toString());
        }
    }

    /* renamed from: lambda$geturl_download$14$com-neptunesoft-bacdz-PhilosophyActivity, reason: not valid java name */
    /* synthetic */ void m700xf0877e7f(Exception exc) {
        try {
            handler.removeCallbacks(this.time_wait_out);
            this.count_time_wait = -1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        close_dialog();
        final AlertDialog create = new AlertDialog.Builder(this).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.PhilosophyActivity$$ExternalSyntheticLambda15
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PhilosophyActivity.this.m699xe1bd1441(create, dialogInterface);
            }
        });
        create.setTitle("Error !.");
        create.setMessage("عذرا هناك خطأ في الحصول على رابط تحميل الملف من الخادم, و ذلك بسبب كمية البيانات المحدودة و الخاصة بتحميل ملفات التطبيق على هواتفكم نحن نعمل على توسيع خدماتنا على مستوى الخوادم الخاصة بـ Firebase نتمنى أن تتفهم المشكلة كما يمكنك المحاولة من حين إلى آخر في مدة أقصاها 24 ساعة .");
        create.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.PhilosophyActivity$$ExternalSyntheticLambda16
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* renamed from: lambda$geturl_download$12$com-neptunesoft-bacdz-PhilosophyActivity, reason: not valid java name */
    /* synthetic */ void m699xe1bd1441(AlertDialog alertDialog, DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        alertDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
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

    public void delete_file(String FILE_NAME) {
        File file = new File(getFilesDir(), FILE_NAME);
        if (file.exists()) {
            file.delete();
        }
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
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.PhilosophyActivity$$ExternalSyntheticLambda9
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PhilosophyActivity.this.m693xbbba6200(dialogInterface);
            }
        });
        this.dialog_connect_internet.setCancelable(false);
        this.dialog_connect_internet.setMessage("قم بالإتصال بالشبكة لتحميل الملف");
        this.dialog_connect_internet.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.PhilosophyActivity$$ExternalSyntheticLambda10
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_connect_internet.show();
    }

    /* renamed from: lambda$connect_internet$15$com-neptunesoft-bacdz-PhilosophyActivity, reason: not valid java name */
    /* synthetic */ void m693xbbba6200(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_connect_internet.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
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

    public class DownloadFileAsync extends AsyncTask<String, String, String> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        public DownloadFileAsync() {
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            try {
                PhilosophyActivity.handler.removeCallbacks(PhilosophyActivity.this.time_wait_out);
                PhilosophyActivity.this.count_time_wait = -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                PhilosophyActivity.this.dialog_wait_check.cancel();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (PhilosophyActivity.this.progressDialog != null) {
                PhilosophyActivity.this.progressDialog.setProgress(0);
            }
            PhilosophyActivity.this.showDialog(1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(String s) {
            PhilosophyActivity.handler.postDelayed(PhilosophyActivity.this.buffer_onPostExecute, 100L);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onProgressUpdate(String... values) {
            super.onProgressUpdate((Object[]) values);
            Log.d("ANDRO_ASYNC", values[0]);
            PhilosophyActivity.this.progressDialog.setProgress(Integer.parseInt(values[0]));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public String doInBackground(String... strings) {
            try {
                PhilosophyActivity.this.wakeLock.acquire(500000L);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                URL url = new URL(strings[0]);
                int contentLength = url.openConnection().getContentLength();
                PhilosophyActivity.this.lengthofFileDownload = contentLength;
                publishProgress("0");
                String format = new DecimalFormat("##.##").format(r0.getContentLength() / 1048576.0f);
                StringBuilder sb = new StringBuilder();
                if (PhilosophyActivity.file_Name.length() < 16) {
                    sb = new StringBuilder(PhilosophyActivity.file_Name);
                } else {
                    for (int i = 0; i < 12; i++) {
                        sb.append(PhilosophyActivity.file_Name.charAt(i));
                    }
                    sb.insert(0, "...");
                }
                String str = "إسم الملف : " + ((Object) sb);
                String str2 = "حجم الملف : " + format + " م.ب";
                try {
                    PhilosophyActivity.this.progressDialog.setMessage(str + IOUtils.LINE_SEPARATOR_UNIX + str2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                PhilosophyActivity.this.progressDialog.setMax(100);
                PhilosophyActivity.handler.postDelayed(PhilosophyActivity.this.write_file_download, 0L);
                FileOutputStream openFileOutput = PhilosophyActivity.this.openFileOutput(PhilosophyActivity.file_Name, 0);
                Log.d("ANDRO_ASYNC", "Length of file: " + contentLength);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
                FileOutputStream fileOutputStream = new FileOutputStream(openFileOutput.getFD());
                byte[] bArr = new byte[1024];
                long j = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1 || PhilosophyActivity.isCancelled) {
                        break;
                    }
                    j += read;
                    publishProgress("" + ((int) ((100 * j) / contentLength)));
                    fileOutputStream.write(bArr, 0, read);
                }
                if (PhilosophyActivity.isCancelled) {
                    cancel(true);
                    PhilosophyActivity.handler.postDelayed(PhilosophyActivity.this.delete_file, 0L);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                bufferedInputStream.close();
                openFileOutput.close();
                PhilosophyActivity.handler.postDelayed(PhilosophyActivity.this.write_file_download_null, 0L);
            } catch (Exception e3) {
                PhilosophyActivity.this.dismissDialog(1);
                e3.printStackTrace();
            }
            try {
                PhilosophyActivity.this.wakeLock.release();
                return null;
            } catch (Exception e4) {
                e4.printStackTrace();
                return null;
            }
        }
    }
}
