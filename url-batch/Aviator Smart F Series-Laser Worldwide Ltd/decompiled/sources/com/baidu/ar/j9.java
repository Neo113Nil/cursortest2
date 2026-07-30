package com.baidu.ar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ar.bean.NavigationNpc;
import com.baidu.ar.marker.model.TranslationPrior;
import com.baidu.ar.util.UiThreadUtil;
import com.baidu.baidumapsdk_api.R;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public class j9 implements SensorEventListener, x4 {
    public static j9 Y;
    public int C;
    public Button D;
    public Button E;
    public Button F;
    public Button G;
    public Button H;
    public TextView K;
    public boolean L;
    public boolean M;
    public boolean N;
    public Handler P;
    public String Q;
    public boolean R;
    public ImageView S;
    public ImageView T;

    /* renamed from: a, reason: collision with root package name */
    public Context f2543a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f2544b;

    /* renamed from: c, reason: collision with root package name */
    public SensorManager f2545c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2546d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f2547e;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f2550h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnClickListener f2551i;

    /* renamed from: k, reason: collision with root package name */
    public RelativeLayout f2553k;

    /* renamed from: l, reason: collision with root package name */
    public RelativeLayout f2554l;

    /* renamed from: m, reason: collision with root package name */
    public RelativeLayout f2555m;

    /* renamed from: n, reason: collision with root package name */
    public RelativeLayout f2556n;

    /* renamed from: o, reason: collision with root package name */
    public RelativeLayout f2557o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2558p;

    /* renamed from: r, reason: collision with root package name */
    public float f2560r;

    /* renamed from: t, reason: collision with root package name */
    public int f2562t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2563u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2564v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2565w;

    /* renamed from: y, reason: collision with root package name */
    public TextView f2567y;

    /* renamed from: z, reason: collision with root package name */
    public ScrollView f2568z;

    /* renamed from: f, reason: collision with root package name */
    public RelativeLayout f2548f = null;

    /* renamed from: g, reason: collision with root package name */
    public RelativeLayout f2549g = null;

    /* renamed from: j, reason: collision with root package name */
    public long f2552j = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f2559q = System.currentTimeMillis();

    /* renamed from: s, reason: collision with root package name */
    public float f2561s = 50.0f;

    /* renamed from: x, reason: collision with root package name */
    public TextView f2566x = null;
    public StringBuffer A = new StringBuffer();
    public long B = System.currentTimeMillis();
    public ValueAnimator I = null;
    public ValueAnimator J = null;
    public int O = -1;
    public final float[] U = new float[3];
    public final float[] V = new float[9];
    public String[] W = {" . ", " . . ", " . . ."};
    public boolean X = false;

    public class a extends Handler {

        /* renamed from: com.baidu.ar.j9$a$a, reason: collision with other inner class name */
        public class RunnableC0037a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Message f2570a;

            public RunnableC0037a(Message message) {
                this.f2570a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                j9 j9Var;
                boolean z7;
                Message message = this.f2570a;
                if (message == null || message.what != 1001 || j9.this.S == null) {
                    return;
                }
                j9.this.i();
                if (j9.this.R) {
                    ValueAnimator valueAnimator = j9.this.I;
                    j9 j9Var2 = j9.this;
                    valueAnimator.addUpdateListener(new a0(j9Var2, j9Var2.T));
                    j9.this.I.start();
                    ValueAnimator valueAnimator2 = j9.this.J;
                    j9 j9Var3 = j9.this;
                    valueAnimator2.addUpdateListener(new a0(j9Var3, j9Var3.S));
                    j9.this.J.start();
                    j9Var = j9.this;
                    z7 = false;
                } else {
                    ValueAnimator valueAnimator3 = j9.this.I;
                    j9 j9Var4 = j9.this;
                    valueAnimator3.addUpdateListener(new a0(j9Var4, j9Var4.S));
                    j9.this.I.start();
                    ValueAnimator valueAnimator4 = j9.this.J;
                    j9 j9Var5 = j9.this;
                    valueAnimator4.addUpdateListener(new a0(j9Var5, j9Var5.T));
                    j9.this.J.start();
                    j9Var = j9.this;
                    z7 = true;
                }
                j9Var.R = z7;
            }
        }

        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            UiThreadUtil.runOnUiThread(new RunnableC0037a(message));
            super.handleMessage(message);
        }
    }

    public class a0 implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public View f2572a;

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ValueAnimator f2573a;

            public a(ValueAnimator valueAnimator) {
                this.f2573a = valueAnimator;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a0.this.f2572a != null) {
                    a0.this.f2572a.setAlpha(((Float) this.f2573a.getAnimatedValue()).floatValue());
                }
            }
        }

        public a0(j9 j9Var, View view) {
            this.f2572a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            UiThreadUtil.runOnUiThread(new a(valueAnimator));
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.f2567y != null) {
                j9.this.f2567y.setText("AREngine Pause");
                j9.this.f2567y.setTextColor(SupportMenu.CATEGORY_MASK);
            }
        }
    }

    public static class b0 extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public x4 f2576a;

        public b0(Looper looper, x4 x4Var) {
            super(looper);
            this.f2576a = x4Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.f2576a.a(message);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f2577a;

        public c(int i8) {
            this.f2577a = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8 = this.f2577a;
            if (i8 == 0) {
                j9.this.e();
            } else if (i8 == 1) {
                j9.this.a(false);
            } else {
                if (i8 != 9) {
                    return;
                }
                j9.this.d();
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2579a;

        public d(String str) {
            this.f2579a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            j9.this.f2566x.setText(this.f2579a);
            j9.this.f2568z.fullScroll(130);
        }
    }

    public class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (j9.this.f2553k == null || j9.this.f2547e == null) {
                return;
            }
            Message message = new Message();
            message.what = 1002;
            message.obj = j9.this.f2553k;
            j9.this.f2547e.sendMessageDelayed(message, 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (j9.this.f2551i != null) {
                j9.this.f2551i.onClick(view);
            }
            j9.this.f2564v = false;
            if (j9.this.f2548f != null) {
                j9.this.f2548f.setVisibility(8);
            }
            if (j9.this.f2553k != null) {
                j9.this.f2553k.setVisibility(8);
            }
            if (j9.this.f2556n != null) {
                j9.this.f2556n.setVisibility(8);
            }
            if (j9.this.f2554l != null) {
                j9.this.f2554l.setVisibility(8);
            }
            if (j9.this.f2557o != null) {
                j9.this.f2557o.setVisibility(8);
            }
            if (j9.this.f2555m != null) {
                j9.this.f2555m.setVisibility(8);
            }
            j9.this.f2558p = false;
            j9.this.f2552j = 0L;
            j9.this.D();
            j9.this.A.append("点击网络异常的重试\n");
            j9 j9Var = j9.this;
            j9Var.b(j9Var.A.toString());
        }
    }

    public class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f2583a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f2584b;

        public g(TextView textView, String str) {
            this.f2583a = textView;
            this.f2584b = str;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f2583a.setText(this.f2584b + j9.this.W[intValue % j9.this.W.length]);
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (j9.this.f2550h != null) {
                j9.this.f2550h.onClick(view);
            }
            j9.this.f2564v = false;
            if (j9.this.f2548f != null) {
                j9.this.f2548f.setVisibility(8);
            }
            if (j9.this.f2553k != null) {
                j9.this.f2553k.setVisibility(8);
            }
            if (j9.this.f2556n != null) {
                j9.this.f2556n.setVisibility(8);
            }
            if (j9.this.f2554l != null) {
                j9.this.f2554l.setVisibility(8);
            }
            if (j9.this.f2557o != null) {
                j9.this.f2557o.setVisibility(8);
            }
            j9.this.f2558p = false;
            j9.this.f2552j = 0L;
            j9.this.D();
            j9.this.A.append("点击了重试\n");
            j9 j9Var = j9.this;
            j9Var.b(j9Var.A.toString());
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.E != null) {
                j9.this.E.setBackground(j9.this.E.getContext().getDrawable(R.drawable.bdar_round_button_red));
            }
            if (j9.this.F != null) {
                j9.this.F.setBackground(j9.this.F.getContext().getDrawable(R.drawable.bdar_round_button_red));
            }
            if (j9.this.G != null) {
                j9.this.G.setBackground(j9.this.G.getContext().getDrawable(R.drawable.bdar_round_button_red));
            }
            if (j9.this.H != null) {
                j9.this.H.setBackground(j9.this.H.getContext().getDrawable(R.drawable.bdar_round_button_red));
            }
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j9.this.f2564v = true;
            j9.this.f();
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.f2548f != null) {
                j9.this.f2548f.setVisibility(8);
            }
            if (j9.this.f2553k != null) {
                j9.this.f2553k.setVisibility(8);
            }
            if (j9.this.f2556n != null) {
                j9.this.f2556n.setVisibility(8);
            }
            if (j9.this.f2554l != null) {
                j9.this.f2554l.setVisibility(8);
            }
            if (j9.this.f2555m != null) {
                j9.this.f2555m.setVisibility(8);
            }
            if (j9.this.f2557o != null) {
                j9.this.f2557o.setVisibility(8);
            }
            j9.this.f2558p = false;
            j9.this.f2552j = 0L;
            j9.this.D();
            j9.this.O = 1;
        }
    }

    public class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f2590a;

        public l(boolean z7) {
            this.f2590a = z7;
        }

        @Override // java.lang.Runnable
        public void run() {
            j9.this.k();
            if (this.f2590a) {
                j9.this.O = 0;
            }
            j9.this.f2564v = false;
            j9.this.f2552j = 0L;
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j9.this.f2564v = false;
            j9.this.k();
            j9.this.f2558p = false;
            j9.this.f2552j = 0L;
            if (j9.this.O == 0) {
                return;
            }
            j9.this.A.append("resetUI:resetUIControllerState \n");
            j9 j9Var = j9.this;
            j9Var.b(j9Var.A.toString());
            j9.this.D();
        }
    }

    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j9.this.h();
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j9.this.c();
        }
    }

    public class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f2595a;

        public p(int i8) {
            this.f2595a = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8;
            if (j9.this.X && ((i8 = this.f2595a) == -86 || i8 == -1)) {
                j9.this.X = false;
                j9.this.u();
            }
            if (this.f2595a == 0) {
                j9.this.X = true;
            }
        }
    }

    public class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f2597a;

        public q(boolean z7) {
            this.f2597a = z7;
        }

        @Override // java.lang.Runnable
        public void run() {
            Button button;
            Resources resources;
            int i8;
            if (j9.this.H != null) {
                if (this.f2597a) {
                    button = j9.this.H;
                    resources = j9.this.H.getResources();
                    i8 = R.drawable.bdar_round_button_greed;
                } else {
                    button = j9.this.H;
                    resources = j9.this.H.getResources();
                    i8 = R.drawable.bdar_round_button_red;
                }
                button.setBackground(resources.getDrawable(i8));
            }
        }
    }

    public class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f2599a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f2600b;

        public r(int i8, float f8) {
            this.f2599a = i8;
            this.f2600b = f8;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.K != null) {
                j9.this.K.setVisibility(0);
                j9.this.K.setText("stepCount:" + this.f2599a + "\r\n stepLength:" + this.f2600b + "\r\n VpasLocCount:" + j9.this.C);
                j9.this.K.setTextColor(-16711936);
            }
        }
    }

    public class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f2602a;

        public s(float f8) {
            this.f2602a = f8;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.K != null) {
                j9.this.K.setVisibility(0);
                j9.this.K.setText(String.valueOf(this.f2602a));
            }
        }
    }

    public class t implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f2604a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NavigationNpc f2605b;

        public t(boolean z7, NavigationNpc navigationNpc) {
            this.f2604a = z7;
            this.f2605b = navigationNpc;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.f2544b != null) {
                if (!this.f2604a || this.f2605b == null) {
                    j9.this.A();
                    return;
                }
                j9.this.f2544b.findViewById(R.id.bdar_npc_view_group).setVisibility(0);
                if (this.f2605b != null) {
                    j9 j9Var = j9.this;
                    j9Var.S = (ImageView) j9Var.f2544b.findViewById(R.id.bdar_iv_npc_icon);
                    j9 j9Var2 = j9.this;
                    j9Var2.T = (ImageView) j9Var2.f2544b.findViewById(R.id.bdar_iv_npc_dir);
                    TextView textView = (TextView) j9.this.f2544b.findViewById(R.id.bdar_npc_content);
                    ((RelativeLayout) j9.this.f2544b.findViewById(R.id.bdar_npc_bg)).setBackground(new BitmapDrawable(BitmapFactory.decodeFile(this.f2605b.getBGPath())));
                    j9.this.T.setImageBitmap(BitmapFactory.decodeFile(this.f2605b.getDirPath()));
                    j9.this.S.setImageBitmap(BitmapFactory.decodeFile(this.f2605b.getIconPath()));
                    if (TextUtils.isEmpty(j9.this.Q) || (!j9.this.Q.equals(this.f2605b.getDirPath()) && j9.this.P != null)) {
                        j9.this.Q = this.f2605b.getDirPath();
                        j9.this.P.removeMessages(1001);
                        j9.this.P.removeCallbacksAndMessages(null);
                        Message message = new Message();
                        message.what = 1001;
                        j9.this.P.sendMessageDelayed(message, 4000L);
                    }
                    String titleTxt = this.f2605b.getTitleTxt();
                    int indexOf = titleTxt.indexOf("[");
                    int indexOf2 = titleTxt.indexOf("]") - 1;
                    if (indexOf < 0 || indexOf2 < 0) {
                        textView.setText(titleTxt);
                        return;
                    }
                    SpannableString spannableString = new SpannableString(titleTxt.replace("[", "").replace("]", ""));
                    spannableString.setSpan(new AbsoluteSizeSpan(55), indexOf, indexOf2, 33);
                    spannableString.setSpan(new ud(55), indexOf, indexOf2, 33);
                    spannableString.setSpan(new StyleSpan(0), indexOf, indexOf2, 33);
                    textView.setText(spannableString);
                }
            }
        }
    }

    public class u extends AnimatorListenerAdapter {
        public u() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Message message = new Message();
            message.what = 1001;
            j9.this.P.sendMessageDelayed(message, 4000L);
        }
    }

    public class v implements Runnable {
        public v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.F != null) {
                j9.this.F.setBackground(j9.this.F.getResources().getDrawable(R.drawable.bdar_round_button_greed));
                j9.this.F.setTextColor(-16777216);
                j9.this.F.setText("R");
            }
        }
    }

    public class w implements Runnable {
        public w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.f2548f != null) {
                j9.this.f2548f.setVisibility(8);
            }
            if (j9.this.f2553k != null) {
                j9.this.f2553k.setVisibility(8);
            }
            if (j9.this.f2556n != null) {
                j9.this.f2556n.setVisibility(8);
            }
            if (j9.this.f2554l != null) {
                j9.this.f2554l.setVisibility(8);
            }
            if (j9.this.f2557o != null) {
                j9.this.f2557o.setVisibility(8);
            }
            j9.this.f2547e.removeCallbacksAndMessages(null);
            j9.this.A.append("渲染路线 \n");
            j9 j9Var = j9.this;
            j9Var.b(j9Var.A.toString());
            if (j9.this.F != null) {
                j9.this.F.setBackground(j9.this.F.getResources().getDrawable(R.drawable.bdar_round_button_greed));
                j9.this.F.setTextColor(-16777216);
                j9.this.F.setText("R");
            }
        }
    }

    public class x implements Runnable {
        public x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j9.this.f2547e.removeMessages(1002);
            j9.this.f2564v = false;
            j9 j9Var = j9.this;
            j9Var.a(j9Var.f2565w, true);
            j9.this.f2565w = false;
        }
    }

    public class y implements Runnable {
        public y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.G != null) {
                j9.this.G.setBackground(j9.this.G.getResources().getDrawable(R.drawable.bdar_round_button_greed));
                j9.this.G.setTextColor(-16777216);
                j9.this.G.setText(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
            }
        }
    }

    public class z implements Runnable {
        public z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j9.this.f2567y != null) {
                j9.this.f2567y.setText("AREngine Tracking");
                j9.this.f2567y.setTextColor(-16711936);
            }
        }
    }

    public j9(Context context, ViewGroup viewGroup, boolean z7) {
        this.f2543a = context;
        this.f2544b = viewGroup;
        if (z7) {
            return;
        }
        this.f2547e = new b0(context.getMainLooper(), this);
    }

    public final void B() {
        UiThreadUtil.runOnUiThread(new i());
    }

    public final void D() {
        x();
    }

    public void E() {
        this.f2563u = true;
        this.L = true;
    }

    public void F() {
        this.A.append("showARUI\n");
        b(this.A.toString());
        Handler handler = this.f2547e;
        if (handler != null) {
            handler.post(new k());
        }
    }

    public final void G() {
        SensorManager sensorManager = this.f2545c;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f2545c = null;
        }
    }

    public void H() {
        Button button = this.E;
        if (button != null) {
            button.setBackground(button.getResources().getDrawable(R.drawable.bdar_round_button_greed));
            this.E.setText("L");
            this.E.setTextColor(-16777216);
        }
    }

    public final void i() {
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.J.removeAllUpdateListeners();
            this.I = null;
        }
        if (this.P != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.I = ofFloat;
            ofFloat.setDuration(1000L);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat2;
            ofFloat2.setDuration(1000L);
            this.J.addListener(new u());
        }
    }

    public final void l() {
        if (this.P == null) {
            this.P = new a();
        }
    }

    public void o() {
        this.A.append("case 销毁完成 \n");
        b(this.A.toString());
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i8) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f8 = sensorEvent.sensor.getType() == 3 ? sensorEvent.values[1] : 361.0f;
        if (sensorEvent.sensor.getType() == 11) {
            try {
                SensorManager.getRotationMatrixFromVector(this.V, sensorEvent.values);
                SensorManager.getOrientation(this.V, this.U);
            } catch (Exception unused) {
            }
            float[] fArr = this.U;
            f8 = (float) (a((((int) Math.toDegrees(fArr[0] - fArr[2])) + 360) % 360, Math.toDegrees(this.U[1]), Math.toDegrees(this.U[2]))[1] - 90.0d);
        }
        if (f8 > 360.0f) {
            return;
        }
        this.f2560r = Math.abs(f8);
        long abs = Math.abs(this.f2559q - System.currentTimeMillis()) / 1000;
        if (this.f2558p || abs < 1) {
            return;
        }
        this.f2559q = System.currentTimeMillis();
        if (Math.abs(f8) < this.f2561s) {
            this.f2562t = 1;
            c(0);
            return;
        }
        this.f2546d = true;
        this.f2558p = true;
        if (this.f2547e != null) {
            if (this.f2562t != 1) {
                Message message = new Message();
                message.what = 1001;
                this.f2547e.sendMessage(message);
            } else {
                Message message2 = new Message();
                message2.what = 1001;
                message2.obj = this.f2548f;
                this.f2547e.sendMessageDelayed(message2, 1000L);
            }
        }
    }

    public void q() {
        Handler handler = this.f2547e;
        if (handler != null) {
            handler.post(new o());
        }
    }

    public void v() {
        this.C++;
        this.A.append("********定位成功 第：" + this.C + "次定位成功 \n");
        b(this.A.toString());
    }

    public void w() {
        this.A.append("发帧啦~~~~~~~~\n");
        b(this.A.toString());
    }

    public final void A() {
        ViewGroup viewGroup = this.f2544b;
        if (viewGroup == null || this.P == null) {
            return;
        }
        viewGroup.findViewById(R.id.bdar_npc_view_group).setVisibility(8);
        this.P.removeMessages(1001);
        this.P.removeCallbacksAndMessages(null);
        this.Q = null;
    }

    public void C() {
        this.N = false;
        this.A.append("resetUI \n");
        b(this.A.toString());
        Handler handler = this.f2547e;
        if (handler != null) {
            handler.post(new m());
        }
    }

    public final void c() {
        this.A.append("算法库加载失败 \n");
        b(this.A.toString());
    }

    public final void d() {
    }

    public final void e() {
        if (this.f2548f == null) {
            RelativeLayout relativeLayout = (RelativeLayout) this.f2544b.findViewById(R.id.bdar_lift_up_group);
            this.f2548f = relativeLayout;
            relativeLayout.setBackgroundColor(Color.parseColor("#B2000000"));
        }
        if (this.f2549g == null) {
            this.f2549g = (RelativeLayout) this.f2544b.findViewById(R.id.bdar_top_bar);
        }
        this.f2549g.setVisibility(0);
        this.f2548f.setVisibility(0);
    }

    public final void f() {
        this.A.append("创建定位成功UI \n");
        b(this.A.toString());
        RelativeLayout relativeLayout = this.f2554l;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f2548f;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
        RelativeLayout relativeLayout3 = this.f2553k;
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(8);
        }
        RelativeLayout relativeLayout4 = this.f2556n;
        if (relativeLayout4 != null) {
            relativeLayout4.setVisibility(8);
        }
        RelativeLayout relativeLayout5 = this.f2555m;
        if (relativeLayout5 != null) {
            relativeLayout5.setVisibility(8);
        }
        RelativeLayout relativeLayout6 = this.f2549g;
        if (relativeLayout6 != null) {
            relativeLayout6.setVisibility(8);
        }
        if (this.f2557o == null) {
            this.f2557o = (RelativeLayout) this.f2544b.findViewById(R.id.bdar_locfinish_group);
        }
        this.f2557o.setVisibility(0);
        TextView textView = (TextView) this.f2544b.findViewById(R.id.bdar_text_loc_finish);
        String string = this.f2543a.getResources().getString(R.string.bdar_hint_Loc_finish);
        ValueAnimator duration = ValueAnimator.ofInt(0, 3).setDuration(1000L);
        duration.setRepeatCount(-1);
        duration.addUpdateListener(new g(textView, string));
        duration.start();
    }

    public final void g() {
        this.A.append("创建定位中UI \n");
        b(this.A.toString());
        RelativeLayout relativeLayout = this.f2554l;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f2548f;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
        RelativeLayout relativeLayout3 = this.f2557o;
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(8);
        }
        RelativeLayout relativeLayout4 = this.f2555m;
        if (relativeLayout4 != null) {
            relativeLayout4.setVisibility(8);
        }
        if (this.f2556n == null) {
            this.f2556n = (RelativeLayout) this.f2544b.findViewById(R.id.bdar_locgoing_group);
        }
        this.f2556n.setVisibility(0);
        ImageView imageView = (ImageView) this.f2544b.findViewById(R.id.bdar_image_scan);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) ob.a(this.f2543a, 340.0f), -1);
        layoutParams.setMargins(-((int) ob.a(this.f2543a, 340.0f)), 0, 0, 0);
        imageView.setLayoutParams(layoutParams);
        imageView.startAnimation(AnimationUtils.loadAnimation(this.f2543a, R.anim.bdar_wsdk_anim_rg_scan));
    }

    public final void h() {
        this.A.append("session 创建失败\n");
        b(this.A.toString());
        RelativeLayout relativeLayout = this.f2554l;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f2548f;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
        RelativeLayout relativeLayout3 = this.f2557o;
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(8);
        }
        RelativeLayout relativeLayout4 = this.f2556n;
        if (relativeLayout4 != null) {
            relativeLayout4.setVisibility(8);
        }
        RelativeLayout relativeLayout5 = this.f2553k;
        if (relativeLayout5 != null) {
            relativeLayout5.setVisibility(8);
        }
        if (this.f2555m == null) {
            this.f2555m = (RelativeLayout) this.f2544b.findViewById(R.id.bdar_net_fail_group);
        }
        G();
        this.f2547e.removeCallbacksAndMessages(null);
        this.f2555m.findViewById(R.id.bdar_button_netfail_reset).setOnClickListener(new f());
        this.f2555m.setBackgroundColor(Color.parseColor("#B2000000"));
        this.f2555m.setVisibility(0);
    }

    public boolean j() {
        return this.M;
    }

    public final void k() {
        RelativeLayout relativeLayout = this.f2548f;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f2553k;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
        RelativeLayout relativeLayout3 = this.f2556n;
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(8);
        }
        RelativeLayout relativeLayout4 = this.f2554l;
        if (relativeLayout4 != null) {
            relativeLayout4.setVisibility(8);
        }
        RelativeLayout relativeLayout5 = this.f2555m;
        if (relativeLayout5 != null) {
            relativeLayout5.setVisibility(8);
        }
        RelativeLayout relativeLayout6 = this.f2557o;
        if (relativeLayout6 != null) {
            relativeLayout6.setVisibility(8);
        }
    }

    public void m() {
        Handler handler = this.f2547e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f2547e = null;
        }
        if (this.f2544b != null) {
            this.f2544b = null;
        }
        Y = null;
    }

    public boolean n() {
        return this.O == 0;
    }

    public void p() {
        Handler handler = this.f2547e;
        if (handler != null) {
            handler.post(new n());
        }
    }

    public void r() {
        this.f2565w = true;
        this.f2564v = false;
        this.A.append("onPause\n");
        b(this.A.toString());
        Handler handler = this.f2547e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        k();
        if (!this.L) {
            this.f2563u = false;
        }
        Handler handler2 = this.P;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.P = null;
            a(false, (NavigationNpc) null);
        }
        B();
    }

    public void s() {
        if (this.O == 0) {
            this.A.append("resume 拦截~~~~ \n");
            b(this.A.toString());
            return;
        }
        this.A.append("onResume \n");
        b(this.A.toString());
        k();
        this.f2558p = false;
        this.f2552j = 0L;
        D();
    }

    public void t() {
        this.A.append("case 加载完成 \n");
        b(this.A.toString());
        Button button = this.D;
        if (button != null) {
            button.setBackground(button.getResources().getDrawable(R.drawable.bdar_round_button_greed));
            this.D.setTextColor(-16777216);
            this.D.setText("C");
        }
    }

    public final void u() {
        Handler handler = this.f2547e;
        if (handler != null) {
            handler.post(new x());
        }
    }

    public final void x() {
        if (this.f2545c == null) {
            this.f2545c = (SensorManager) this.f2543a.getSystemService("sensor");
        }
        Sensor defaultSensor = this.f2545c.getDefaultSensor(3);
        if (defaultSensor != null) {
            this.f2545c.registerListener(this, defaultSensor, 0);
            return;
        }
        Sensor defaultSensor2 = this.f2545c.getDefaultSensor(11);
        if (defaultSensor2 != null) {
            this.f2545c.registerListener(this, defaultSensor2, 0);
        }
    }

    public final void y() {
        Handler handler = this.f2547e;
        if (handler != null) {
            handler.removeMessages(1001);
            this.f2547e.removeMessages(1002);
            this.f2547e.removeMessages(1003);
        }
    }

    public final void z() {
        RelativeLayout relativeLayout;
        if (this.f2544b == null || (relativeLayout = this.f2556n) == null) {
            return;
        }
        relativeLayout.setVisibility(8);
    }

    public void b() {
        this.A.append("清除路线 \n");
        b(this.A.toString());
    }

    public void c(int i8) {
        Handler handler;
        if (this.f2544b == null || (handler = this.f2547e) == null) {
            return;
        }
        handler.post(new c(i8));
    }

    public void e(boolean z7) {
    }

    public void f(boolean z7) {
        Handler handler;
        Runnable bVar;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.B > 100) {
            this.B = currentTimeMillis;
            if (z7) {
                UiThreadUtil.runOnUiThread(new y());
                handler = this.f2547e;
                if (handler != null) {
                    bVar = new z();
                    handler.post(bVar);
                }
            } else {
                B();
                handler = this.f2547e;
                if (handler != null) {
                    bVar = new b();
                    handler.post(bVar);
                }
            }
        }
        this.f2563u = z7;
    }

    public void b(int i8) {
        Handler handler = this.f2547e;
        if (handler != null) {
            handler.post(new p(i8));
        }
    }

    public void c(boolean z7) {
        this.A.append(z7 ? "runAbilityResult success \n" : "runAbilityResult fail \n");
        b(this.A.toString());
        UiThreadUtil.runOnUiThread(new q(z7));
    }

    public void d(boolean z7) {
        if (z7) {
            UiThreadUtil.runOnUiThread(new v());
            Handler handler = this.f2547e;
            if (handler != null) {
                handler.post(new w());
            }
        }
    }

    public static j9 a(Context context, ViewGroup viewGroup, boolean z7) {
        if (Y == null) {
            Y = new j9(context, viewGroup, z7);
        }
        return Y;
    }

    public void b(View.OnClickListener onClickListener) {
        this.f2550h = onClickListener;
    }

    public final String a(long j8) {
        return new SimpleDateFormat(cn.hutool.core.date.d.NORM_TIME_PATTERN).format(new Date(j8));
    }

    public void a() {
        this.N = false;
    }

    public final void b(TranslationPrior translationPrior) {
        if (translationPrior != null) {
            this.A.append("lng:" + translationPrior.getCoordinate()[0] + "\n lat:" + translationPrior.getCoordinate()[1] + "\ntime:" + a(System.currentTimeMillis()) + "\n floorID:" + translationPrior.getFloorID() + "\n");
        }
        b(this.A.toString());
    }

    public void a(float f8) {
        UiThreadUtil.runOnUiThread(new s(f8));
    }

    public final void b(String str) {
        Handler handler = this.f2547e;
        if (handler == null || this.f2566x == null) {
            return;
        }
        handler.post(new d(str));
    }

    public void a(int i8) {
        if (i8 > 1) {
            this.N = true;
        }
        this.A.append("********定位成功 定位结果：" + i8 + "个 \n");
        b(this.A.toString());
        G();
        if (this.f2547e != null) {
            y();
            this.f2547e.post(new j());
        }
    }

    public void b(boolean z7) {
        this.A.append("hideARUI \n");
        b(this.A.toString());
        Handler handler = this.f2547e;
        if (handler != null) {
            handler.post(new l(z7));
        }
    }

    public void a(int i8, int i9, float f8) {
        Handler handler;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.B <= 100 || (handler = this.f2547e) == null) {
            return;
        }
        this.B = currentTimeMillis;
        handler.post(new r(i9, f8));
    }

    public void a(int i8, int i9, int i10, int i11) {
        ViewGroup viewGroup = this.f2544b;
        if (viewGroup != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((RelativeLayout) viewGroup.findViewById(R.id.bdar_npc_view_group)).getLayoutParams();
            layoutParams.rightMargin = i8 - i10;
            layoutParams.topMargin = i11;
            int i12 = (int) ((i10 - 13) * 0.17699115f);
            layoutParams.height = i12;
            layoutParams.width = i10;
            ImageView imageView = this.T;
            if (imageView == null || this.S == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams2.height = i12;
            layoutParams2.width = i12;
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.S.getLayoutParams();
            layoutParams3.height = i12;
            layoutParams3.width = i12;
        }
    }

    @Override // com.baidu.ar.x4
    public void a(Message message) {
        if (this.f2547e == null || this.f2564v) {
            return;
        }
        switch (message.what) {
            case 1001:
                Object obj = message.obj;
                if (obj != null) {
                    ((View) obj).setVisibility(8);
                }
                G();
                c(1);
                break;
            case 1002:
                Object obj2 = message.obj;
                if (obj2 != null) {
                    ((View) obj2).setVisibility(8);
                }
                g();
                Message message2 = new Message();
                message2.what = 1003;
                this.f2547e.sendMessageDelayed(message2, 6000L);
                break;
            case 1003:
                z();
                if (!this.f2563u) {
                    a(false, true);
                    break;
                } else {
                    long j8 = this.f2552j + 1;
                    this.f2552j = j8;
                    if (j8 < 3) {
                        a(true);
                        break;
                    } else {
                        a(false, false);
                        break;
                    }
                }
        }
    }

    public void a(View.OnClickListener onClickListener) {
        this.f2551i = onClickListener;
    }

    public void a(l1 l1Var) {
    }

    public void a(TranslationPrior translationPrior) {
        b(translationPrior);
    }

    public void a(String str) {
        this.A.append(str + "\n");
        b(this.A.toString());
    }

    public final void a(boolean z7) {
        if (this.f2560r >= this.f2561s || this.f2546d) {
            RelativeLayout relativeLayout = this.f2548f;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout2 = this.f2554l;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
            RelativeLayout relativeLayout3 = this.f2556n;
            if (relativeLayout3 != null) {
                relativeLayout3.setVisibility(8);
            }
            RelativeLayout relativeLayout4 = this.f2557o;
            if (relativeLayout4 != null) {
                relativeLayout4.setVisibility(8);
            }
            if (this.f2553k == null) {
                this.f2553k = (RelativeLayout) this.f2544b.findViewById(R.id.bdar_scanaroud_group);
            }
            this.f2553k.setVisibility(0);
            if (this.f2549g == null) {
                this.f2549g = (RelativeLayout) this.f2544b.findViewById(R.id.bdar_top_bar);
            }
            this.f2549g.setVisibility(0);
            ImageView imageView = (ImageView) this.f2544b.findViewById(R.id.bdar_image_scanaroud);
            ((TextView) this.f2544b.findViewById(R.id.bdar_text_scanroud)).setText(z7 ? R.string.bdar_hint_vpas_reset : R.string.bdar_hint_scan);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f2543a, R.anim.bdar_wsdk_scan_round_anim_set);
            loadAnimation.setAnimationListener(new e());
            imageView.setAnimation(loadAnimation);
            imageView.startAnimation(loadAnimation);
        }
    }

    public void a(boolean z7, NavigationNpc navigationNpc) {
        l();
        UiThreadUtil.runOnUiThread(new t(z7, navigationNpc));
    }

    public final void a(boolean z7, boolean z8) {
        if (z7 || this.N || this.O == 0) {
            return;
        }
        this.A.append("创建定位错误弹窗 \n");
        b(this.A.toString());
        Handler handler = this.f2547e;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        RelativeLayout relativeLayout = this.f2548f;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout2 = this.f2553k;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(8);
        }
        RelativeLayout relativeLayout3 = this.f2556n;
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(8);
        }
        RelativeLayout relativeLayout4 = this.f2557o;
        if (relativeLayout4 != null) {
            relativeLayout4.setVisibility(8);
        }
        RelativeLayout relativeLayout5 = this.f2555m;
        if (relativeLayout5 != null) {
            relativeLayout5.setVisibility(8);
        }
        if (this.f2554l == null) {
            this.f2554l = (RelativeLayout) this.f2544b.findViewById(R.id.bdar_fail_group);
        }
        ((TextView) this.f2544b.findViewById(R.id.bdar_text_fail)).setText(z8 ? R.string.bdar_tracking_fail : R.string.bdar_location_fail);
        this.f2554l.setVisibility(0);
        this.f2554l.setBackgroundColor(Color.parseColor("#B2000000"));
        ((Button) this.f2544b.findViewById(R.id.bdar_button_reset)).setOnClickListener(new h());
    }

    public final double[] a(double d8, double d9, double d10) {
        double atan2;
        double d11;
        double d12;
        double radians = Math.toRadians(d8);
        double radians2 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON - Math.toRadians(d9);
        double radians3 = Math.toRadians(d10);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double cos2 = Math.cos(radians2);
        double sin2 = Math.sin(radians2);
        double cos3 = Math.cos(radians3);
        double sin3 = Math.sin(radians3);
        double d13 = cos * sin2;
        double d14 = (sin * sin3) - (d13 * cos3);
        double d15 = (d13 * sin3) + (sin * cos3);
        double d16 = cos2 * cos3;
        double d17 = (sin * sin2 * cos3) + (cos * sin3);
        double d18 = ((-sin) * sin2 * sin3) + (cos * cos3);
        double[] dArr = {d14, (-cos) * cos2, d15, d16, -sin2, (-cos2) * sin3, d17, cos2 * sin, d18};
        if (d16 > 0.9999d) {
            atan2 = Math.atan2(d15, d18);
            d11 = 1.5707963267948966d;
        } else {
            if (d16 >= -0.9999d) {
                atan2 = Math.atan2(-d17, d14);
                double atan22 = Math.atan2(-dArr[5], dArr[4]);
                double asin = Math.asin(dArr[3]);
                if (Double.isNaN(asin)) {
                    d12 = atan22;
                    d11 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
                } else {
                    d11 = asin;
                    d12 = atan22;
                }
                return new double[]{(atan2 * 180.0d) / 3.141592653589793d, (d11 * 180.0d) / 3.141592653589793d, (d12 * 180.0d) / 3.141592653589793d};
            }
            atan2 = Math.atan2(d15, d18);
            d11 = -1.5707963267948966d;
        }
        d12 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        return new double[]{(atan2 * 180.0d) / 3.141592653589793d, (d11 * 180.0d) / 3.141592653589793d, (d12 * 180.0d) / 3.141592653589793d};
    }
}
