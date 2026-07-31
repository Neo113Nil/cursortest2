package androidx.media;

import android.media.VolumeProvider;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private final int f1102a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1103b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1104c;

    /* renamed from: d, reason: collision with root package name */
    private int f1105d;

    /* renamed from: e, reason: collision with root package name */
    private d f1106e;

    /* renamed from: f, reason: collision with root package name */
    private VolumeProvider f1107f;

    class a extends VolumeProvider {
        a(int i7, int i8, int i9, String str) {
            super(i7, i8, i9, str);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i7) {
            l.this.e(i7);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i7) {
            l.this.f(i7);
        }
    }

    class b extends VolumeProvider {
        b(int i7, int i8, int i9) {
            super(i7, i8, i9);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i7) {
            l.this.e(i7);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i7) {
            l.this.f(i7);
        }
    }

    private static class c {
        static void a(VolumeProvider volumeProvider, int i7) {
            volumeProvider.setCurrentVolume(i7);
        }
    }

    public static abstract class d {
        public abstract void a(l lVar);
    }

    public l(int i7, int i8, int i9) {
        this(i7, i8, i9, null);
    }

    public l(int i7, int i8, int i9, String str) {
        this.f1102a = i7;
        this.f1103b = i8;
        this.f1105d = i9;
        this.f1104c = str;
    }

    public final int a() {
        return this.f1105d;
    }

    public final int b() {
        return this.f1103b;
    }

    public final int c() {
        return this.f1102a;
    }

    public Object d() {
        VolumeProvider bVar;
        if (this.f1107f == null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                bVar = new a(this.f1102a, this.f1103b, this.f1105d, this.f1104c);
            } else if (i7 >= 21) {
                bVar = new b(this.f1102a, this.f1103b, this.f1105d);
            }
            this.f1107f = bVar;
        }
        return this.f1107f;
    }

    public abstract void e(int i7);

    public abstract void f(int i7);

    public void g(d dVar) {
        this.f1106e = dVar;
    }

    public final void h(int i7) {
        this.f1105d = i7;
        if (Build.VERSION.SDK_INT >= 21) {
            c.a((VolumeProvider) d(), i7);
        }
        d dVar = this.f1106e;
        if (dVar != null) {
            dVar.a(this);
        }
    }
}
