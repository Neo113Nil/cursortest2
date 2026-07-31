package a3;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.dc3;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.qy1;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.uy1;
import com.google.android.gms.internal.ads.wo0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f187a;

    /* renamed from: b, reason: collision with root package name */
    private final uy1 f188b;

    /* renamed from: c, reason: collision with root package name */
    private String f189c;

    /* renamed from: d, reason: collision with root package name */
    private String f190d;

    /* renamed from: e, reason: collision with root package name */
    private String f191e;

    /* renamed from: f, reason: collision with root package name */
    private String f192f;

    /* renamed from: g, reason: collision with root package name */
    private int f193g;

    /* renamed from: h, reason: collision with root package name */
    private int f194h;

    /* renamed from: i, reason: collision with root package name */
    private PointF f195i;

    /* renamed from: j, reason: collision with root package name */
    private PointF f196j;

    /* renamed from: k, reason: collision with root package name */
    private Handler f197k;

    /* renamed from: l, reason: collision with root package name */
    private Runnable f198l;

    public x(Context context) {
        this.f193g = 0;
        this.f198l = new Runnable() { // from class: a3.j
            @Override // java.lang.Runnable
            public final void run() {
                x.this.g();
            }
        };
        this.f187a = context;
        this.f194h = ViewConfiguration.get(context).getScaledTouchSlop();
        y2.t.u().b();
        this.f197k = y2.t.u().a();
        this.f188b = y2.t.t().a();
    }

    public x(Context context, String str) {
        this(context);
        this.f189c = str;
    }

    private final void s(Context context) {
        ArrayList arrayList = new ArrayList();
        int u6 = u(arrayList, "None", true);
        final int u7 = u(arrayList, "Shake", true);
        final int u8 = u(arrayList, "Flick", true);
        qy1 qy1Var = qy1.NONE;
        int ordinal = this.f188b.a().ordinal();
        final int i7 = ordinal != 1 ? ordinal != 2 ? u6 : u8 : u7;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, y2.t.r().k());
        final AtomicInteger atomicInteger = new AtomicInteger(i7);
        builder.setTitle("Setup gesture");
        builder.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i7, new DialogInterface.OnClickListener() { // from class: a3.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                atomicInteger.set(i8);
            }
        });
        builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: a3.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                x.this.r();
            }
        });
        builder.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: a3.r
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                x.this.h(atomicInteger, i7, u7, u8, dialogInterface, i8);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: a3.h
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                x.this.r();
            }
        });
        builder.create().show();
    }

    private final boolean t(float f7, float f8, float f9, float f10) {
        return Math.abs(this.f195i.x - f7) < ((float) this.f194h) && Math.abs(this.f195i.y - f8) < ((float) this.f194h) && Math.abs(this.f196j.x - f9) < ((float) this.f194h) && Math.abs(this.f196j.y - f10) < ((float) this.f194h);
    }

    private static final int u(List<String> list, String str, boolean z6) {
        if (!z6) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    final /* synthetic */ void a() {
        s(this.f187a);
    }

    final /* synthetic */ void b() {
        s(this.f187a);
    }

    final /* synthetic */ void c(dc3 dc3Var) {
        if (y2.t.t().j(this.f187a, this.f190d, this.f191e)) {
            dc3Var.execute(new Runnable() { // from class: a3.v
                @Override // java.lang.Runnable
                public final void run() {
                    x.this.b();
                }
            });
        } else {
            y2.t.t().d(this.f187a, this.f190d, this.f191e);
        }
    }

    final /* synthetic */ void d(dc3 dc3Var) {
        if (y2.t.t().j(this.f187a, this.f190d, this.f191e)) {
            dc3Var.execute(new Runnable() { // from class: a3.i
                @Override // java.lang.Runnable
                public final void run() {
                    x.this.f();
                }
            });
        } else {
            y2.t.t().d(this.f187a, this.f190d, this.f191e);
        }
    }

    final /* synthetic */ void e() {
        y2.t.t().c(this.f187a);
    }

    final /* synthetic */ void f() {
        y2.t.t().c(this.f187a);
    }

    final /* synthetic */ void g() {
        this.f193g = 4;
        r();
    }

    final /* synthetic */ void h(AtomicInteger atomicInteger, int i7, int i8, int i9, DialogInterface dialogInterface, int i10) {
        uy1 uy1Var;
        qy1 qy1Var;
        if (atomicInteger.get() != i7) {
            if (atomicInteger.get() == i8) {
                uy1Var = this.f188b;
                qy1Var = qy1.SHAKE;
            } else if (atomicInteger.get() == i9) {
                uy1Var = this.f188b;
                qy1Var = qy1.FLICK;
            } else {
                uy1Var = this.f188b;
                qy1Var = qy1.NONE;
            }
            uy1Var.j(qy1Var);
        }
        r();
    }

    final /* synthetic */ void i(String str, DialogInterface dialogInterface, int i7) {
        y2.t.q();
        g2.q(this.f187a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    final /* synthetic */ void j(int i7, int i8, int i9, int i10, int i11, DialogInterface dialogInterface, int i12) {
        if (i12 != i7) {
            if (i12 == i8) {
                io0.b("Debug mode [Creative Preview] selected.");
                wo0.f13894a.execute(new Runnable() { // from class: a3.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.this.l();
                    }
                });
                return;
            }
            if (i12 == i9) {
                io0.b("Debug mode [Troubleshooting] selected.");
                wo0.f13894a.execute(new Runnable() { // from class: a3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        x.this.k();
                    }
                });
                return;
            }
            if (i12 == i10) {
                final dc3 dc3Var = wo0.f13898e;
                dc3 dc3Var2 = wo0.f13894a;
                if (this.f188b.m()) {
                    dc3Var.execute(new Runnable() { // from class: a3.w
                        @Override // java.lang.Runnable
                        public final void run() {
                            x.this.e();
                        }
                    });
                    return;
                } else {
                    dc3Var2.execute(new Runnable() { // from class: a3.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            x.this.d(dc3Var);
                        }
                    });
                    return;
                }
            }
            if (i12 == i11) {
                final dc3 dc3Var3 = wo0.f13898e;
                dc3 dc3Var4 = wo0.f13894a;
                if (this.f188b.m()) {
                    dc3Var3.execute(new Runnable() { // from class: a3.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            x.this.a();
                        }
                    });
                    return;
                } else {
                    dc3Var4.execute(new Runnable() { // from class: a3.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            x.this.c(dc3Var3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.f187a instanceof Activity)) {
            io0.f("Can not create dialog without Activity Context");
            return;
        }
        String str = this.f189c;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            y2.t.q();
            Map<String, String> s7 = g2.s(build);
            for (String str3 : s7.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append(s7.get(str3));
                sb.append("\n\n");
            }
            String trim = sb.toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                str2 = trim;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f187a);
        builder.setMessage(str2);
        builder.setTitle("Ad Information");
        builder.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: a3.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i13) {
                x.this.i(str2, dialogInterface2, i13);
            }
        });
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: a3.t
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i13) {
            }
        });
        builder.create().show();
    }

    final /* synthetic */ void k() {
        c0 t6 = y2.t.t();
        Context context = this.f187a;
        String str = this.f190d;
        String str2 = this.f191e;
        String str3 = this.f192f;
        boolean m7 = t6.m();
        t6.h(t6.j(context, str, str2));
        if (!t6.m()) {
            t6.d(context, str, str2);
            return;
        }
        if (!m7 && !TextUtils.isEmpty(str3)) {
            t6.e(context, str2, str3, str);
        }
        io0.b("Device is linked for debug signals.");
        t6.i(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    final /* synthetic */ void l() {
        c0 t6 = y2.t.t();
        Context context = this.f187a;
        String str = this.f190d;
        String str2 = this.f191e;
        if (!t6.k(context, str, str2)) {
            t6.i(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(t6.f55f)) {
            io0.b("Creative is not pushed for this device.");
            t6.i(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(t6.f55f)) {
            io0.b("The app is not linked for creative preview.");
            t6.d(context, str, str2);
        } else if ("0".equals(t6.f55f)) {
            io0.b("Device is linked for in app preview.");
            t6.i(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void m(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f193g = 0;
            this.f195i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i7 = this.f193g;
        if (i7 == -1) {
            return;
        }
        if (i7 == 0) {
            if (actionMasked == 5) {
                this.f193g = 5;
                this.f196j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f197k.postDelayed(this.f198l, ((Long) sw.c().b(m10.f8228j3)).longValue());
                return;
            }
            return;
        }
        if (i7 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z6 = false;
                for (int i8 = 0; i8 < historySize; i8++) {
                    z6 |= !t(motionEvent.getHistoricalX(0, i8), motionEvent.getHistoricalY(0, i8), motionEvent.getHistoricalX(1, i8), motionEvent.getHistoricalY(1, i8));
                }
                if (t(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z6) {
                    return;
                }
            }
            this.f193g = -1;
            this.f197k.removeCallbacks(this.f198l);
        }
    }

    public final void n(String str) {
        this.f190d = str;
    }

    public final void o(String str) {
        this.f191e = str;
    }

    public final void p(String str) {
        this.f189c = str;
    }

    public final void q(String str) {
        this.f192f = str;
    }

    public final void r() {
        try {
            if (!(this.f187a instanceof Activity)) {
                io0.f("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(y2.t.t().b())) {
                str = "Creative preview";
            }
            String str2 = true != y2.t.t().m() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int u6 = u(arrayList, "Ad information", true);
            final int u7 = u(arrayList, str, true);
            final int u8 = u(arrayList, str2, true);
            boolean booleanValue = ((Boolean) sw.c().b(m10.P6)).booleanValue();
            final int u9 = u(arrayList, "Open ad inspector", booleanValue);
            final int u10 = u(arrayList, "Ad inspector settings", booleanValue);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f187a, y2.t.r().k());
            builder.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: a3.p
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    x.this.j(u6, u7, u8, u9, u10, dialogInterface, i7);
                }
            });
            builder.create().show();
        } catch (WindowManager.BadTokenException e7) {
            r1.l("", e7);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f189c);
        sb.append(",DebugSignal: ");
        sb.append(this.f192f);
        sb.append(",AFMA Version: ");
        sb.append(this.f191e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f190d);
        sb.append("}");
        return sb.toString();
    }
}
