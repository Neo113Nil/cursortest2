package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: androidx.core.view.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1308o {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11971a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1310p f11972b;

    /* renamed from: c, reason: collision with root package name */
    private final b f11973c;

    /* renamed from: d, reason: collision with root package name */
    private final a f11974d;

    /* renamed from: e, reason: collision with root package name */
    private VelocityTracker f11975e;

    /* renamed from: f, reason: collision with root package name */
    private float f11976f;

    /* renamed from: g, reason: collision with root package name */
    private int f11977g;

    /* renamed from: h, reason: collision with root package name */
    private int f11978h;

    /* renamed from: i, reason: collision with root package name */
    private int f11979i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f11980j;

    /* renamed from: androidx.core.view.o$a */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i4);
    }

    /* renamed from: androidx.core.view.o$b */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i4);
    }

    public C1308o(Context context, InterfaceC1310p interfaceC1310p) {
        this(context, interfaceC1310p, new b() { // from class: androidx.core.view.m
            @Override // androidx.core.view.C1308o.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i4) {
                C1308o.c(context2, iArr, motionEvent, i4);
            }
        }, new a() { // from class: androidx.core.view.n
            @Override // androidx.core.view.C1308o.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i4) {
                float f4;
                f4 = C1308o.f(velocityTracker, motionEvent, i4);
                return f4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = AbstractC1289e0.i(context, viewConfiguration, motionEvent.getDeviceId(), i4, motionEvent.getSource());
        iArr[1] = AbstractC1289e0.h(context, viewConfiguration, motionEvent.getDeviceId(), i4, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i4) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f11978h == source && this.f11979i == deviceId && this.f11977g == i4) {
            return false;
        }
        this.f11973c.a(this.f11971a, this.f11980j, motionEvent, i4);
        this.f11978h = source;
        this.f11979i = deviceId;
        this.f11977g = i4;
        return true;
    }

    private float e(MotionEvent motionEvent, int i4) {
        if (this.f11975e == null) {
            this.f11975e = VelocityTracker.obtain();
        }
        return this.f11974d.a(this.f11975e, motionEvent, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i4) {
        X.a(velocityTracker, motionEvent);
        X.b(velocityTracker, 1000);
        return X.d(velocityTracker, i4);
    }

    public void g(MotionEvent motionEvent, int i4) {
        boolean d4 = d(motionEvent, i4);
        if (this.f11980j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f11975e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f11975e = null;
                return;
            }
            return;
        }
        float e4 = e(motionEvent, i4) * this.f11972b.b();
        float signum = Math.signum(e4);
        if (d4 || (signum != Math.signum(this.f11976f) && signum != 0.0f)) {
            this.f11972b.c();
        }
        float abs = Math.abs(e4);
        int[] iArr = this.f11980j;
        if (abs < iArr[0]) {
            return;
        }
        float max = Math.max(-r6, Math.min(e4, iArr[1]));
        this.f11976f = this.f11972b.a(max) ? max : 0.0f;
    }

    C1308o(Context context, InterfaceC1310p interfaceC1310p, b bVar, a aVar) {
        this.f11977g = -1;
        this.f11978h = -1;
        this.f11979i = -1;
        this.f11980j = new int[]{Integer.MAX_VALUE, 0};
        this.f11971a = context;
        this.f11972b = interfaceC1310p;
        this.f11973c = bVar;
        this.f11974d = aVar;
    }
}
