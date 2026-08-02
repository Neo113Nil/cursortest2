package com.neptunesoft.bacdz;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnDrawListener;
import com.github.barteksc.pdfviewer.listener.OnErrorListener;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageErrorListener;
import com.github.barteksc.pdfviewer.listener.OnTapListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.neptunesoft.bacdz.adapter.PdfDocumentAdapter;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Map;
import org.apache.commons.io.IOUtils;

/* loaded from: classes4.dex */
public class PdfGalleryActivity extends AppCompatActivity {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DIALOG_DOWNLOAD_PROGRESSE = 1;
    private static String dir_file_pdf;
    public static String file_Name;
    public static Handler handler = new Handler();
    static boolean isCancelled;
    boolean ad_showing;
    Button btnReloadFiles;
    private AlertDialog dialog_connect_internet;
    private AlertDialog dialog_internet_low;
    private AlertDialog dialog_nointernet;
    private ProgressDialog dialog_wait_check;
    FloatingActionButton floating_print;
    ImageView imageViewReloadFiles;
    int lengthofFileDownload;
    LinearLayout linearLayoutReloadFiles;
    InterstitialAd mInterstitialAd;
    PDFView pdf_View;
    private ProgressDialog progressDialog;
    ReviewInfo reviewInfo;
    ReviewManager reviewManager;
    StorageReference storageRef;
    StorageReference storageReference;
    PowerManager.WakeLock wakeLock;
    int count_time_wait = -1;
    Runnable time_wait_out = new Runnable() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity.3
        @Override // java.lang.Runnable
        public void run() {
            if (PdfGalleryActivity.this.count_time_wait < 15) {
                PdfGalleryActivity.this.count_time_wait++;
                PdfGalleryActivity.handler.postDelayed(PdfGalleryActivity.this.time_wait_out, 1000L);
                return;
            }
            if (!PdfGalleryActivity.this.test_connection()) {
                PdfGalleryActivity.this.no_connection();
            } else if (!PdfGalleryActivity.this.ad_showing) {
                PdfGalleryActivity.this.connection_low();
            }
            PdfGalleryActivity.this.count_time_wait = -1;
            PdfGalleryActivity.this.getWindow().clearFlags(128);
            PdfGalleryActivity.handler.removeCallbacks(PdfGalleryActivity.this.time_wait_out);
        }
    };
    Runnable buffer_onPostExecute = new Runnable() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity.4
        @Override // java.lang.Runnable
        public void run() {
            if (PdfGalleryActivity.this.progressDialog != null) {
                PdfGalleryActivity.this.progressDialog.setProgress(0);
            }
            PdfGalleryActivity.this.write_file_download("file_download_pdf_gallery.txt", "");
            String read_file_download = PdfGalleryActivity.this.read_file_download("file_download_pdf_gallery.txt");
            if (read_file_download != null) {
                PdfGalleryActivity.this.delete_file(read_file_download);
                PdfGalleryActivity.this.write_file_download("file_download_pdf_gallery.txt", "");
            }
            try {
                PdfGalleryActivity.handler.removeCallbacks(PdfGalleryActivity.this.time_wait_out);
                PdfGalleryActivity.this.count_time_wait = -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                PdfGalleryActivity.this.close_dialog();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (new File(PdfGalleryActivity.this.getFilesDir().getAbsoluteFile() + "/" + PdfGalleryActivity.file_Name).length() == PdfGalleryActivity.this.lengthofFileDownload) {
                PdfGalleryActivity.this.finish();
                PdfGalleryActivity pdfGalleryActivity = PdfGalleryActivity.this;
                pdfGalleryActivity.startActivity(pdfGalleryActivity.getIntent());
                Toast.makeText(PdfGalleryActivity.this, "تم تحميل الملف بنجاح.", 1).show();
            } else {
                PdfGalleryActivity.this.delete_file(PdfGalleryActivity.file_Name);
                Toast.makeText(PdfGalleryActivity.this, "تعذر عملية تحميل الملف '" + PdfGalleryActivity.file_Name + "' تحقق من إتصال الجهاز بالشبكة !.", 1).show();
            }
            PdfGalleryActivity.this.dismissDialog(1);
            PdfGalleryActivity.this.getWindow().clearFlags(128);
            PdfGalleryActivity.handler.removeCallbacks(PdfGalleryActivity.this.buffer_onPostExecute);
        }
    };
    Runnable write_file_download = new Runnable() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity.5
        @Override // java.lang.Runnable
        public void run() {
            PdfGalleryActivity.this.write_file_download("file_download_pdf_gallery.txt", PdfGalleryActivity.file_Name);
            PdfGalleryActivity.handler.removeCallbacks(PdfGalleryActivity.this.write_file_download);
        }
    };
    Runnable delete_file = new Runnable() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity.6
        @Override // java.lang.Runnable
        public void run() {
            if (PdfGalleryActivity.this.files_exist(PdfGalleryActivity.file_Name)) {
                PdfGalleryActivity.this.delete_file(PdfGalleryActivity.file_Name);
            }
            PdfGalleryActivity.this.write_file_download("file_download_pdf_gallery.txt", "");
            PdfGalleryActivity.handler.removeCallbacks(PdfGalleryActivity.this.delete_file);
        }
    };
    Runnable write_file_download_null = new Runnable() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity.7
        @Override // java.lang.Runnable
        public void run() {
            PdfGalleryActivity.this.write_file_download("file_download_pdf_gallery.txt", "");
            PdfGalleryActivity.handler.removeCallbacks(PdfGalleryActivity.this.write_file_download_null);
        }
    };

    static /* synthetic */ void lambda$initreview$22(Task task) {
    }

    static /* synthetic */ void lambda$loadPdfFile$4(Canvas canvas, float f, float f2, int i) {
    }

    static /* synthetic */ void lambda$loadPdfFile$5(Canvas canvas, float f, float f2, int i) {
    }

    public String getDir_file() {
        return dir_file_pdf;
    }

    public static void setDir_file(String dir_file) {
        dir_file_pdf = dir_file;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_gallery);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), new OnApplyWindowInsetsListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda12
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return PdfGalleryActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        setRequestedOrientation(1);
        String read_file_download = read_file_download("file_download_pdf_gallery.txt");
        if (read_file_download != null) {
            delete_file(read_file_download);
            write_file_download("file_download_pdf_gallery.txt", "");
        }
        MobileAds.initialize(this, new OnInitializationCompleteListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda13
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public final void onInitializationComplete(InitializationStatus initializationStatus) {
                PdfGalleryActivity.this.m689lambda$onCreate$1$comneptunesoftbacdzPdfGalleryActivity(initializationStatus);
            }
        });
        this.pdf_View = (PDFView) findViewById(R.id.pdf_viewer);
        this.floating_print = (FloatingActionButton) findViewById(R.id.floating_print);
        this.imageViewReloadFiles = (ImageView) findViewById(R.id.imageViewReloadFiles);
        this.btnReloadFiles = (Button) findViewById(R.id.btnReloadFiles);
        this.linearLayoutReloadFiles = (LinearLayout) findViewById(R.id.linearLayoutReloadFiles);
        this.pdf_View.setVisibility(4);
        this.linearLayoutReloadFiles.setVisibility(8);
        refreshUI();
        this.btnReloadFiles.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PdfGalleryActivity.this.m690lambda$onCreate$2$comneptunesoftbacdzPdfGalleryActivity(view);
            }
        });
        this.floating_print.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PdfGalleryActivity.this.m691lambda$onCreate$3$comneptunesoftbacdzPdfGalleryActivity(view);
            }
        });
        if (getResources().getConfiguration().orientation == 2) {
            this.floating_print.setVisibility(4);
        } else {
            this.floating_print.setVisibility(0);
        }
        loadPdfFile();
        if (SplashScreen.useApplication >= 20) {
            initreview();
        }
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

    /* renamed from: lambda$onCreate$1$com-neptunesoft-bacdz-PdfGalleryActivity, reason: not valid java name */
    /* synthetic */ void m689lambda$onCreate$1$comneptunesoftbacdzPdfGalleryActivity(InitializationStatus initializationStatus) {
        Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
        for (String str : adapterStatusMap.keySet()) {
            AdapterStatus adapterStatus = adapterStatusMap.get(str);
            Log.d("MyApp", String.format("Adapter name: %s, Description: %s, Latency: %d", str, adapterStatus.getDescription(), Integer.valueOf(adapterStatus.getLatency())));
        }
        loadAdMobInterstitialAds();
    }

    /* renamed from: lambda$onCreate$2$com-neptunesoft-bacdz-PdfGalleryActivity, reason: not valid java name */
    /* synthetic */ void m690lambda$onCreate$2$comneptunesoftbacdzPdfGalleryActivity(View view) {
        if (files_exist(getDir_file())) {
            delete_file(getDir_file());
        }
        if (test_connection()) {
            dialog_wait();
            getWindow().addFlags(128);
            geturl_download(getDir_file());
            return;
        }
        connect_internet();
    }

    /* renamed from: lambda$onCreate$3$com-neptunesoft-bacdz-PdfGalleryActivity, reason: not valid java name */
    /* synthetic */ void m691lambda$onCreate$3$comneptunesoftbacdzPdfGalleryActivity(View view) {
        try {
            ((PrintManager) getSystemService("print")).print("Document", new PdfDocumentAdapter(this, getFilesDir().getPath() + "/" + dir_file_pdf), new PrintAttributes.Builder().build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadPdfFile() {
        FileInputStream fileInputStream;
        String stringExtra = getIntent().getStringExtra("ViewType");
        if (stringExtra == null || !stringExtra.equals("assets") || getFilesDir() == null) {
            return;
        }
        try {
            fileInputStream = openFileInput(getDir_file());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fileInputStream = null;
        }
        boolean z = SplashScreen.darkmode;
        this.pdf_View.fromStream(fileInputStream).password(null).defaultPage(0).enableSwipe(true).swipeHorizontal(false).scrollHandle(new DefaultScrollHandle(this)).enableDoubletap(true).onDraw(new OnDrawListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda4
            @Override // com.github.barteksc.pdfviewer.listener.OnDrawListener
            public final void onLayerDrawn(Canvas canvas, float f, float f2, int i) {
                PdfGalleryActivity.lambda$loadPdfFile$4(canvas, f, f2, i);
            }
        }).onDraw(new OnDrawListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda5
            @Override // com.github.barteksc.pdfviewer.listener.OnDrawListener
            public final void onLayerDrawn(Canvas canvas, float f, float f2, int i) {
                PdfGalleryActivity.lambda$loadPdfFile$5(canvas, f, f2, i);
            }
        }).onPageError(new OnPageErrorListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda6
            @Override // com.github.barteksc.pdfviewer.listener.OnPageErrorListener
            public final void onPageError(int i, Throwable th) {
                PdfGalleryActivity.this.m684lambda$loadPdfFile$6$comneptunesoftbacdzPdfGalleryActivity(i, th);
            }
        }).enableAnnotationRendering(true).onTap(new OnTapListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda7
            @Override // com.github.barteksc.pdfviewer.listener.OnTapListener
            public final boolean onTap(MotionEvent motionEvent) {
                return PdfGalleryActivity.this.m685lambda$loadPdfFile$7$comneptunesoftbacdzPdfGalleryActivity(motionEvent);
            }
        }).onLoad(new OnLoadCompleteListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda8
            @Override // com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener
            public final void loadComplete(int i) {
                PdfGalleryActivity.this.m686lambda$loadPdfFile$8$comneptunesoftbacdzPdfGalleryActivity(i);
            }
        }).onError(new OnErrorListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda9
            @Override // com.github.barteksc.pdfviewer.listener.OnErrorListener
            public final void onError(Throwable th) {
                PdfGalleryActivity.this.m687lambda$loadPdfFile$9$comneptunesoftbacdzPdfGalleryActivity(th);
            }
        }).load();
    }

    /* renamed from: lambda$loadPdfFile$6$com-neptunesoft-bacdz-PdfGalleryActivity, reason: not valid java name */
    /* synthetic */ void m684lambda$loadPdfFile$6$comneptunesoftbacdzPdfGalleryActivity(int i, Throwable th) {
        Toast.makeText(this, "عذرا هنالك مشكلة ما في عرض هذا الملف", 1).show();
    }

    /* renamed from: lambda$loadPdfFile$7$com-neptunesoft-bacdz-PdfGalleryActivity, reason: not valid java name */
    /* synthetic */ boolean m685lambda$loadPdfFile$7$comneptunesoftbacdzPdfGalleryActivity(MotionEvent motionEvent) {
        if (this.floating_print.getVisibility() == 0) {
            this.floating_print.setVisibility(4);
        } else {
            this.floating_print.setVisibility(0);
        }
        return false;
    }

    /* renamed from: lambda$loadPdfFile$8$com-neptunesoft-bacdz-PdfGalleryActivity, reason: not valid java name */
    /* synthetic */ void m686lambda$loadPdfFile$8$comneptunesoftbacdzPdfGalleryActivity(int i) {
        setRequestedOrientation(10);
        this.linearLayoutReloadFiles.setVisibility(8);
        this.pdf_View.setVisibility(0);
    }

    /* renamed from: lambda$loadPdfFile$9$com-neptunesoft-bacdz-PdfGalleryActivity, reason: not valid java name */
    /* synthetic */ void m687lambda$loadPdfFile$9$comneptunesoftbacdzPdfGalleryActivity(Throwable th) {
        setRequestedOrientation(1);
        this.pdf_View.setVisibility(4);
        this.linearLayoutReloadFiles.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAdMobInterstitialAds() {
        InterstitialAd.load(this, getString(R.string.Interstitial_Reload_Files_UnitId), new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity.1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd interstitialAd) {
                PdfGalleryActivity.this.mInterstitialAd = interstitialAd;
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                PdfGalleryActivity.this.mInterstitialAd = null;
            }
        });
    }

    public void showInterstitialAds(final String url) {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(this);
            this.mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity.2
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    PdfGalleryActivity.this.ad_showing = true;
                    PdfGalleryActivity.this.mInterstitialAd = null;
                    PdfGalleryActivity.this.loadAdMobInterstitialAds();
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    PdfGalleryActivity.this.ad_showing = false;
                    PdfGalleryActivity.this.download(url);
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
        progressDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PdfGalleryActivity.this.m692x3feb61a1(dialogInterface);
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
        this.progressDialog.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                PdfGalleryActivity.lambda$onCreateDialog$11(dialogInterface, i2);
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

    /* renamed from: lambda$onCreateDialog$10$com-neptunesoft-bacdz-PdfGalleryActivity, reason: not valid java name */
    /* synthetic */ void m692x3feb61a1(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.progressDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    static /* synthetic */ void lambda$onCreateDialog$11(DialogInterface dialogInterface, int i) {
        isCancelled = true;
        dialogInterface.dismiss();
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

    public boolean files_exist(String fileName) {
        return new File(getFilesDir(), fileName).exists();
    }

    public void delete_file(String FILE_NAME) {
        File file = new File(getFilesDir(), FILE_NAME);
        if (file.exists()) {
            file.delete();
        }
    }

    private void connect_internet() {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_connect_internet = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda21
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PdfGalleryActivity.this.m678xefb6ee32(dialogInterface);
            }
        });
        this.dialog_connect_internet.setCancelable(false);
        this.dialog_connect_internet.setMessage("قم بالإتصال بالشبكة لتحميل الملف");
        this.dialog_connect_internet.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda22
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_connect_internet.show();
    }

    /* renamed from: lambda$connect_internet$12$com-neptunesoft-bacdz-PdfGalleryActivity, reason: not valid java name */
    /* synthetic */ void m678xefb6ee32(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_connect_internet.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    public void close_dialog() {
        AlertDialog alertDialog = this.dialog_internet_low;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.dialog_internet_low.cancel();
        }
        AlertDialog alertDialog2 = this.dialog_nointernet;
        if (alertDialog2 != null && alertDialog2.isShowing()) {
            this.dialog_nointernet.cancel();
        }
        ProgressDialog progressDialog = this.dialog_wait_check;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.dialog_wait_check.cancel();
        }
        AlertDialog alertDialog3 = this.dialog_connect_internet;
        if (alertDialog3 != null && alertDialog3.isShowing()) {
            this.dialog_connect_internet.cancel();
        }
        ProgressDialog progressDialog2 = this.progressDialog;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            this.progressDialog.cancel();
        }
        getWindow().clearFlags(128);
    }

    public void geturl_download(String fileName) {
        file_Name = fileName;
        StorageReference reference = FirebaseStorage.getInstance().getReference();
        this.storageReference = reference;
        this.storageRef = reference.child(fileName);
        write_file_download("file_download_pdf_gallery.txt", fileName);
        this.storageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda19
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                PdfGalleryActivity.this.m680x3ab3aa0e((Uri) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda20
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                PdfGalleryActivity.this.m682x50e3496b(exc);
            }
        });
    }

    /* renamed from: lambda$geturl_download$14$com-neptunesoft-bacdz-PdfGalleryActivity, reason: not valid java name */
    /* synthetic */ void m680x3ab3aa0e(Uri uri) {
        if (this.count_time_wait != -1) {
            showInterstitialAds(uri.toString());
        }
    }

    /* renamed from: lambda$geturl_download$17$com-neptunesoft-bacdz-PdfGalleryActivity, reason: not valid java name */
    /* synthetic */ void m682x50e3496b(Exception exc) {
        try {
            handler.removeCallbacks(this.time_wait_out);
            this.count_time_wait = -1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        close_dialog();
        final AlertDialog create = new AlertDialog.Builder(this).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda10
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PdfGalleryActivity.this.m681x4218df2d(create, dialogInterface);
            }
        });
        create.setTitle("Error !.");
        create.setMessage("عذرا هناك خطأ في الحصول على رابط تحميل الملف من الخادم, و ذلك بسبب كمية البيانات المحدودة و الخاصة بتحميل ملفات التطبيق على هواتفكم نحن نعمل على توسيع خدماتنا على مستوى الخوادم الخاصة بـ Firebase نتمنى أن تتفهم المشكلة كما يمكنك المحاولة من حين إلى آخر في مدة أقصاها 24 ساعة .");
        create.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda11
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* renamed from: lambda$geturl_download$15$com-neptunesoft-bacdz-PdfGalleryActivity, reason: not valid java name */
    /* synthetic */ void m681x4218df2d(AlertDialog alertDialog, DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        alertDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
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

    /* JADX INFO: Access modifiers changed from: private */
    public void no_connection() {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_nointernet = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda16
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PdfGalleryActivity.this.m688lambda$no_connection$18$comneptunesoftbacdzPdfGalleryActivity(dialogInterface);
            }
        });
        this.dialog_nointernet.setCancelable(false);
        this.dialog_nointernet.setMessage("لا يوجد إتصال بالشبكة !.");
        this.dialog_nointernet.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda17
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_nointernet.show();
    }

    /* renamed from: lambda$no_connection$18$com-neptunesoft-bacdz-PdfGalleryActivity, reason: not valid java name */
    /* synthetic */ void m688lambda$no_connection$18$comneptunesoftbacdzPdfGalleryActivity(DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        this.dialog_nointernet.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    public void connection_low() {
        close_dialog();
        getWindow().clearFlags(128);
        AlertDialog create = new AlertDialog.Builder(this).create();
        this.dialog_internet_low = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PdfGalleryActivity.this.m679x32ba01f2(dialogInterface);
            }
        });
        this.dialog_internet_low.setCancelable(false);
        this.dialog_internet_low.setMessage("تعذر عملية الإتصال بالخادم, حاول مرة أخرى !.");
        this.dialog_internet_low.setButton(-2, "رجوع", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        this.dialog_internet_low.show();
    }

    /* renamed from: lambda$connection_low$20$com-neptunesoft-bacdz-PdfGalleryActivity, reason: not valid java name */
    /* synthetic */ void m679x32ba01f2(DialogInterface dialogInterface) {
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

    private void refreshUI() {
        if (SplashScreen.darkmode) {
            this.imageViewReloadFiles.setImageResource(R.drawable.ic_error_file_dark);
        } else {
            this.imageViewReloadFiles.setImageResource(R.drawable.ic_error_file);
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

    private void initreview() {
        if (test_connection()) {
            ReviewManager create = ReviewManagerFactory.create(this);
            this.reviewManager = create;
            create.requestReviewFlow().addOnCompleteListener(new OnCompleteListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda18
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    PdfGalleryActivity.this.m683lambda$initreview$23$comneptunesoftbacdzPdfGalleryActivity(task);
                }
            });
        }
    }

    /* renamed from: lambda$initreview$23$com-neptunesoft-bacdz-PdfGalleryActivity, reason: not valid java name */
    /* synthetic */ void m683lambda$initreview$23$comneptunesoftbacdzPdfGalleryActivity(Task task) {
        if (task.isSuccessful()) {
            ReviewInfo reviewInfo = (ReviewInfo) task.getResult();
            this.reviewInfo = reviewInfo;
            this.reviewManager.launchReviewFlow(this, reviewInfo).addOnCompleteListener(new OnCompleteListener() { // from class: com.neptunesoft.bacdz.PdfGalleryActivity$$ExternalSyntheticLambda23
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    PdfGalleryActivity.lambda$initreview$22(task2);
                }
            });
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

    public class DownloadFileAsync extends AsyncTask<String, String, String> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        public DownloadFileAsync() {
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            try {
                PdfGalleryActivity.handler.removeCallbacks(PdfGalleryActivity.this.time_wait_out);
                PdfGalleryActivity.this.count_time_wait = -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                PdfGalleryActivity.this.dialog_wait_check.cancel();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (PdfGalleryActivity.this.progressDialog != null) {
                PdfGalleryActivity.this.progressDialog.setProgress(0);
            }
            PdfGalleryActivity.this.showDialog(1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(String s) {
            PdfGalleryActivity.handler.postDelayed(PdfGalleryActivity.this.buffer_onPostExecute, 100L);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onProgressUpdate(String... values) {
            super.onProgressUpdate((Object[]) values);
            Log.d("ANDRO_ASYNC", values[0]);
            PdfGalleryActivity.this.progressDialog.setProgress(Integer.parseInt(values[0]));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public String doInBackground(String... strings) {
            try {
                PdfGalleryActivity.this.wakeLock.acquire(500000L);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                URL url = new URL(strings[0]);
                int contentLength = url.openConnection().getContentLength();
                PdfGalleryActivity.this.lengthofFileDownload = contentLength;
                publishProgress("0");
                String format = new DecimalFormat("##.##").format(r0.getContentLength() / 1048576.0f);
                StringBuilder sb = new StringBuilder();
                if (PdfGalleryActivity.file_Name.length() < 16) {
                    sb = new StringBuilder(PdfGalleryActivity.file_Name);
                } else {
                    for (int i = 0; i < 12; i++) {
                        sb.append(PdfGalleryActivity.file_Name.charAt(i));
                    }
                    sb.insert(0, "...");
                }
                String str = "إسم الملف : " + ((Object) sb);
                String str2 = "حجم الملف : " + format + " م.ب";
                try {
                    PdfGalleryActivity.this.progressDialog.setMessage(str + IOUtils.LINE_SEPARATOR_UNIX + str2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                PdfGalleryActivity.this.progressDialog.setMax(100);
                PdfGalleryActivity.handler.postDelayed(PdfGalleryActivity.this.write_file_download, 0L);
                FileOutputStream openFileOutput = PdfGalleryActivity.this.openFileOutput(PdfGalleryActivity.file_Name, 0);
                Log.d("ANDRO_ASYNC", "Length of file: " + contentLength);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
                FileOutputStream fileOutputStream = new FileOutputStream(openFileOutput.getFD());
                byte[] bArr = new byte[1024];
                long j = 0;
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1 || PdfGalleryActivity.isCancelled) {
                        break;
                    }
                    j += read;
                    publishProgress("" + ((int) ((100 * j) / contentLength)));
                    fileOutputStream.write(bArr, 0, read);
                }
                if (PdfGalleryActivity.isCancelled) {
                    cancel(true);
                    PdfGalleryActivity.handler.postDelayed(PdfGalleryActivity.this.delete_file, 0L);
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                bufferedInputStream.close();
                openFileOutput.close();
                PdfGalleryActivity.handler.postDelayed(PdfGalleryActivity.this.write_file_download_null, 0L);
            } catch (Exception e3) {
                PdfGalleryActivity.this.dismissDialog(1);
                e3.printStackTrace();
            }
            try {
                PdfGalleryActivity.this.wakeLock.release();
                return null;
            } catch (Exception e4) {
                e4.printStackTrace();
                return null;
            }
        }
    }
}
