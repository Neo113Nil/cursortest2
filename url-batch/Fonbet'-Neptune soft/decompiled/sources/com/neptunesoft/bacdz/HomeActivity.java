package com.neptunesoft.bacdz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Insets;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.view.MenuCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.webkit.internal.AssetHelper;
import java.util.Random;

/* loaded from: classes4.dex */
public class HomeActivity extends AppCompatActivity {
    CardView cv_avg;
    CardView cv_challenge;
    CardView cv_cours;
    CardView cv_note;
    CardView cv_ressource;
    CardView cv_subject;
    CardView cv_time;
    CardView cv_tips;
    private boolean doubleBackToExitPressedOnce;
    LinearLayout lyt_avg;
    LinearLayout lyt_cours;
    LinearLayout lyt_note;
    LinearLayout lyt_quiz;
    LinearLayout lyt_ressource;
    LinearLayout lyt_subject;
    LinearLayout lyt_time;
    LinearLayout lyt_tips;
    Toolbar toolbar;
    TextView txtv_tips_home;
    String[] tips = {"التعليم هو أقوى سلاح يمكنك استعماله لتغيير العالم. - نيلسون مانديلا", "أعطي رجلا سمكة وستكون بذلك قد أطعمته في يومه، علم رجل كيف يصطاد سمكة وستكون قد أطعمته في حياته كلها. - مايمونيدس", "جذور التعليم مريرة، لكن ثمارها حلوة. - أرسطو", "التعليم هو ما تبقى بعد نسيان ما تعلمه المرء في المدرسة. - ألبرت اينشتاين", "يأتي أفضل الطلاب من المنازل التي تقدر التعليم حيث توجد كتب، ويرى الأطفال اباءهم يقرؤونها. - ليو بوسكاغليا", "الشخص الذي لم يرتكب أي خطأ لم يجرب أي شيء جديد. - اينشتاين", "إن لم تستطع شرح فكرة لطفل في السادسة من عمره فأنت لم تفهم هذه الفكرة بعد. - اينشتاين", "الخيال أهم من المعرفة، بالخيال نستطيع التنبؤ ورؤية المستقبل. - اينشتاين", "من يفتح باب مدرسة يغلق باب سجن. - فيكتور هيغو", "ابدأ من حيث أنت. استعمل ما تملك. قم بما تستطيع. - أرتور أش", "التعليم هو جواز السفر للمستقبل، الغد يعود للأشخاص الذي يستعدون له اليوم. - مالكون إكس", "اذا كنت تعتقد أن التعليم مكلف، جرب الجهل", "السر للتقد إلى الأمام هو أن تبدأ. السر لتبدأ هو أن تقسم مهامك المعقدة إلى مهام صغيرة يمكن السيطرة عليها، ثم بعد ذلك إبدأ بالمهمة الأولى. - مارك توين", "إن ما نتعلمه بمتعة لن ننساه أبدا. - ألفريد ميرسيير", "التغير هو النتيجة النهائية للتعلم الحقيقي. - ليو بوسكاغليا", "العقل المثقف دائما ما يكون لديه تساؤلات أكثر من الاجابات. - هيلين كيلر", "أهم شيء أن لا تتوقف عن التساؤل. - ألبرت اينشتاين", "لا تحتاج لأن تكون مميزا حتى تبدأ لكن يجب عليك ان تبدأ حتى تكون مميز", "حفز نفسك، لأنه لا أحد سيقوم بذلك من اجلك", "ليس هنالك بديل للعمل الجدي. - توماس ليديسون", "للحياة قاعدتين، الاولى عدم الاستسلام، والثانية تذكر الأولى دائما", "المُنافسة الحقيقية دائماً ما تكون بين ما تقوم بعمله، وما أنت قادر على عمله، إنّك تقيس نفسك مع نفسك وليس مع أي شخص آخر", "إذا كنت ستهتم لكل ما يقوله الآخرون، فسوف تصبح أسيراً لديهم، لا تستمد تقديرك لذاتك من شخص آخر وكن مستقلاً بذاتك", "الشخص الحكيم هو الذي يصنع فرصاً أكثر من تلك التي ضاعت منه أو فشل فيها", "أفضل مُعلم في التاريخ هو التدرّب على فعل الشيء، فدرب نفسك على أن تكون ناجحاً في أي شيء", "نافس نفسك، فلا تذاكر حتى تصبح الأول فقط بين أقرانك، ولكن ذاكر لتصبح الأول أمام نفسك", "لا تصاحب أي شخص يحاول أن يقلل من طموحك، فهؤلاء دائماً صغار في حياتهم، والعظيم يجعلك دائماً تشعر بأن طموحك له مكان على أرض الواقع", "بدل أن تلعن الظلام، أوقد شمعة", "ربما تفشل إذا خاطرت، ولكن من المؤكد أنك ستفشل إذا لم تخاطر", "التسويف هو ذلك الشيء الماكر الذي يجعلك تظل كما كنت بالأمس"};
    private final Handler mHandler = new Handler();
    private final Runnable mRunnable = new Runnable() { // from class: com.neptunesoft.bacdz.HomeActivity.1
        @Override // java.lang.Runnable
        public void run() {
            HomeActivity.this.doubleBackToExitPressedOnce = false;
        }
    };

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), new OnApplyWindowInsetsListener() { // from class: com.neptunesoft.bacdz.HomeActivity$$ExternalSyntheticLambda11
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return HomeActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.txtv_tips_home = (TextView) findViewById(R.id.txtv_tips_home);
        this.cv_cours = (CardView) findViewById(R.id.cv_cours);
        this.cv_subject = (CardView) findViewById(R.id.cv_subject);
        this.cv_note = (CardView) findViewById(R.id.cv_note);
        this.cv_ressource = (CardView) findViewById(R.id.cv_ressource);
        this.cv_time = (CardView) findViewById(R.id.cv_time);
        this.cv_challenge = (CardView) findViewById(R.id.cv_challenge);
        this.cv_avg = (CardView) findViewById(R.id.cv_avg);
        this.cv_tips = (CardView) findViewById(R.id.cv_tips);
        this.lyt_tips = (LinearLayout) findViewById(R.id.lyt_tips);
        this.lyt_avg = (LinearLayout) findViewById(R.id.lyt_avg);
        this.lyt_quiz = (LinearLayout) findViewById(R.id.lyt_quiz);
        this.lyt_time = (LinearLayout) findViewById(R.id.lyt_time);
        this.lyt_ressource = (LinearLayout) findViewById(R.id.lyt_ressource);
        this.lyt_note = (LinearLayout) findViewById(R.id.lyt_note);
        this.lyt_subject = (LinearLayout) findViewById(R.id.lyt_subject);
        this.lyt_cours = (LinearLayout) findViewById(R.id.lyt_cours);
        setSupportActionBar(this.toolbar);
        refreshUI();
        this.txtv_tips_home.setText(this.tips[new Random().nextInt(29)]);
        this.cv_cours.setCardElevation(10.0f);
        this.cv_subject.setCardElevation(10.0f);
        this.cv_note.setCardElevation(10.0f);
        this.cv_ressource.setCardElevation(10.0f);
        this.cv_time.setCardElevation(10.0f);
        this.cv_challenge.setCardElevation(10.0f);
        this.cv_avg.setCardElevation(10.0f);
        this.cv_tips.setCardElevation(10.0f);
        this.lyt_tips.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.HomeActivity$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.this.m635lambda$onCreate$1$comneptunesoftbacdzHomeActivity(view);
            }
        });
        this.lyt_time.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.HomeActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.this.m636lambda$onCreate$2$comneptunesoftbacdzHomeActivity(view);
            }
        });
        this.lyt_note.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.HomeActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.this.m637lambda$onCreate$3$comneptunesoftbacdzHomeActivity(view);
            }
        });
        this.lyt_quiz.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.HomeActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.this.m638lambda$onCreate$4$comneptunesoftbacdzHomeActivity(view);
            }
        });
        this.lyt_cours.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.HomeActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.this.m639lambda$onCreate$5$comneptunesoftbacdzHomeActivity(view);
            }
        });
        this.lyt_subject.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.HomeActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.this.m640lambda$onCreate$6$comneptunesoftbacdzHomeActivity(view);
            }
        });
        this.lyt_avg.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.HomeActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.this.m641lambda$onCreate$7$comneptunesoftbacdzHomeActivity(view);
            }
        });
        this.lyt_ressource.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.HomeActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.this.m642lambda$onCreate$8$comneptunesoftbacdzHomeActivity(view);
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

    /* renamed from: lambda$onCreate$1$com-neptunesoft-bacdz-HomeActivity, reason: not valid java name */
    /* synthetic */ void m635lambda$onCreate$1$comneptunesoftbacdzHomeActivity(View view) {
        startActivity(new Intent(this, (Class<?>) TipsActivity.class));
    }

    /* renamed from: lambda$onCreate$2$com-neptunesoft-bacdz-HomeActivity, reason: not valid java name */
    /* synthetic */ void m636lambda$onCreate$2$comneptunesoftbacdzHomeActivity(View view) {
        startActivity(new Intent(this, (Class<?>) TimerActivity.class));
    }

    /* renamed from: lambda$onCreate$3$com-neptunesoft-bacdz-HomeActivity, reason: not valid java name */
    /* synthetic */ void m637lambda$onCreate$3$comneptunesoftbacdzHomeActivity(View view) {
        startActivity(new Intent(this, (Class<?>) NoteActivity.class));
    }

    /* renamed from: lambda$onCreate$4$com-neptunesoft-bacdz-HomeActivity, reason: not valid java name */
    /* synthetic */ void m638lambda$onCreate$4$comneptunesoftbacdzHomeActivity(View view) {
        startActivity(new Intent(this, (Class<?>) QuizActivity.class));
    }

    /* renamed from: lambda$onCreate$5$com-neptunesoft-bacdz-HomeActivity, reason: not valid java name */
    /* synthetic */ void m639lambda$onCreate$5$comneptunesoftbacdzHomeActivity(View view) {
        startActivity(new Intent(this, (Class<?>) CoursActivity.class));
    }

    /* renamed from: lambda$onCreate$6$com-neptunesoft-bacdz-HomeActivity, reason: not valid java name */
    /* synthetic */ void m640lambda$onCreate$6$comneptunesoftbacdzHomeActivity(View view) {
        startActivity(new Intent(this, (Class<?>) TopicsSolutionsActivity.class));
    }

    /* renamed from: lambda$onCreate$7$com-neptunesoft-bacdz-HomeActivity, reason: not valid java name */
    /* synthetic */ void m641lambda$onCreate$7$comneptunesoftbacdzHomeActivity(View view) {
        startActivity(new Intent(this, (Class<?>) AvgActivity.class));
    }

    /* renamed from: lambda$onCreate$8$com-neptunesoft-bacdz-HomeActivity, reason: not valid java name */
    /* synthetic */ void m642lambda$onCreate$8$comneptunesoftbacdzHomeActivity(View view) {
        startActivity(new Intent(this, (Class<?>) ResourcesActivity.class));
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        if (SplashScreen.darkmode) {
            menu.findItem(R.id.item_darkmode).setTitle("الوضع النهاري");
            menu.findItem(R.id.item_darkmode).setIcon(ContextCompat.getDrawable(this, R.drawable.ic_sun));
            return true;
        }
        menu.findItem(R.id.item_darkmode).setTitle("الوضع الليلي");
        menu.findItem(R.id.item_darkmode).setIcon(ContextCompat.getDrawable(this, R.drawable.ic_night));
        return true;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        if (Build.VERSION.SDK_INT >= 28) {
            menu.setGroupDividerEnabled(true);
        } else {
            MenuCompat.setGroupDividerEnabled(menu, true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.item_about) {
            startActivity(new Intent(this, (Class<?>) AboutActivity.class));
            return true;
        }
        if (itemId == R.id.item_close) {
            close_app();
            return true;
        }
        if (itemId == R.id.item_feedback) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) FeedbackActivity.class);
            FeedbackActivity.from_home = true;
            startActivity(intent);
            return true;
        }
        if (itemId == R.id.item_share) {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType(AssetHelper.DEFAULT_MIME_TYPE);
            intent2.putExtra("android.intent.extra.SUBJECT", "تطبيق بكالوريا علوم تجريبية");
            intent2.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=com.neptunesoft.bacdz");
            startActivity(Intent.createChooser(intent2, "شارك التطبيق عبر"));
            return true;
        }
        if (itemId == R.id.item_rating) {
            Intent intent3 = new Intent("android.intent.action.VIEW");
            intent3.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.neptunesoft.bacdz"));
            intent3.setPackage("com.android.vending");
            startActivity(intent3);
            return true;
        }
        if (itemId == R.id.item_neptunesoft_apps) {
            Intent intent4 = new Intent("android.intent.action.VIEW");
            intent4.setData(Uri.parse("https://play.google.com/store/apps/dev?id=7512881118161131049"));
            intent4.setPackage("com.android.vending");
            startActivity(intent4);
            return true;
        }
        if (itemId == R.id.item_darkmode) {
            if (SplashScreen.darkmode) {
                edit(false);
                SplashScreen.darkmode = false;
                AppCompatDelegate.setDefaultNightMode(1);
                item.setChecked(false);
            } else {
                edit(true);
                SplashScreen.darkmode = true;
                AppCompatDelegate.setDefaultNightMode(2);
                item.setChecked(true);
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mHandler.removeCallbacks(this.mRunnable);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "أنقر مرة أخرى لغلق التطبيق", 0).show();
        this.mHandler.postDelayed(this.mRunnable, 2000L);
    }

    private void close_app() {
        final AlertDialog create = new AlertDialog.Builder(this).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neptunesoft.bacdz.HomeActivity$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                HomeActivity.this.m634lambda$close_app$9$comneptunesoftbacdzHomeActivity(create, dialogInterface);
            }
        });
        create.setMessage("هل تريد غلق التطبيق ؟.");
        create.setButton(-1, "غلق", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.HomeActivity$$ExternalSyntheticLambda9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HomeActivity.this.m633lambda$close_app$10$comneptunesoftbacdzHomeActivity(dialogInterface, i);
            }
        });
        create.setButton(-2, "إلغاء", new DialogInterface.OnClickListener() { // from class: com.neptunesoft.bacdz.HomeActivity$$ExternalSyntheticLambda10
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        create.show();
    }

    /* renamed from: lambda$close_app$9$com-neptunesoft-bacdz-HomeActivity, reason: not valid java name */
    /* synthetic */ void m634lambda$close_app$9$comneptunesoftbacdzHomeActivity(AlertDialog alertDialog, DialogInterface dialogInterface) {
        if (SplashScreen.darkmode) {
            return;
        }
        alertDialog.getButton(-1).setTextColor(getResources().getColor(R.color.blue));
        alertDialog.getButton(-2).setTextColor(getResources().getColor(R.color.blue));
    }

    /* renamed from: lambda$close_app$10$com-neptunesoft-bacdz-HomeActivity, reason: not valid java name */
    /* synthetic */ void m633lambda$close_app$10$comneptunesoftbacdzHomeActivity(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        finish();
    }

    void edit(boolean value) {
        SharedPreferences sharedPreferences = getSharedPreferences("DARKMODE", 0);
        SplashScreen.darkmode = sharedPreferences.getBoolean("switchkey1", false);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("switchkey1", value);
        edit.apply();
    }

    void refreshUI() {
        ImageView imageView = (ImageView) findViewById(R.id.imgv_tips);
        ImageView imageView2 = (ImageView) findViewById(R.id.imgv_avg);
        ImageView imageView3 = (ImageView) findViewById(R.id.imgv_challenge);
        ImageView imageView4 = (ImageView) findViewById(R.id.imgv_time);
        ImageView imageView5 = (ImageView) findViewById(R.id.imgv_ressource);
        ImageView imageView6 = (ImageView) findViewById(R.id.imgv_note);
        ImageView imageView7 = (ImageView) findViewById(R.id.imgv_subject);
        ImageView imageView8 = (ImageView) findViewById(R.id.imgv_cours);
        if (SplashScreen.darkmode) {
            this.toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.items_dark));
            imageView.setImageResource(R.drawable.ic_lamp_dark);
            imageView2.setImageResource(R.drawable.ic_calculator_dark);
            imageView3.setImageResource(R.drawable.ic_question_dark);
            imageView4.setImageResource(R.drawable.ic_timer_dark);
            imageView5.setImageResource(R.drawable.ic_archive_dark);
            imageView6.setImageResource(R.drawable.ic_pencil_dark);
            imageView7.setImageResource(R.drawable.ic_documents_dark);
            imageView8.setImageResource(R.drawable.ic_study_dark);
            return;
        }
        this.toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.items));
        imageView.setImageResource(R.drawable.ic_lamp);
        imageView2.setImageResource(R.drawable.ic_calculator);
        imageView3.setImageResource(R.drawable.ic_question);
        imageView4.setImageResource(R.drawable.ic_timer);
        imageView5.setImageResource(R.drawable.ic_archive);
        imageView6.setImageResource(R.drawable.ic_pencil);
        imageView7.setImageResource(R.drawable.ic_documents);
        imageView8.setImageResource(R.drawable.ic_study);
    }
}
