package X3;

import android.media.SoundPool;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import x3.AbstractC1528C;
import x3.AbstractC1562w;

/* loaded from: classes.dex */
public final class k implements g {

    /* renamed from: a, reason: collision with root package name */
    public final o f3637a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.e f3638b;

    /* renamed from: c, reason: collision with root package name */
    public final C3.e f3639c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f3640d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f3641e;

    /* renamed from: f, reason: collision with root package name */
    public W3.a f3642f;

    /* renamed from: g, reason: collision with root package name */
    public l f3643g;

    /* renamed from: h, reason: collision with root package name */
    public Y3.d f3644h;

    public k(o oVar, l2.e soundPoolManager) {
        kotlin.jvm.internal.i.e(soundPoolManager, "soundPoolManager");
        this.f3637a = oVar;
        this.f3638b = soundPoolManager;
        E3.e eVar = AbstractC1528C.f15989a;
        this.f3639c = AbstractC1562w.a(C3.o.f314a);
        W3.a aVar = oVar.f3654c;
        this.f3642f = aVar;
        soundPoolManager.n(aVar);
        W3.a audioContext = this.f3642f;
        kotlin.jvm.internal.i.e(audioContext, "audioContext");
        l lVar = (l) ((HashMap) soundPoolManager.f14271c).get(audioContext.a());
        if (lVar != null) {
            this.f3643g = lVar;
        } else {
            throw new IllegalStateException(("Could not create SoundPool " + this.f3642f).toString());
        }
    }

    @Override // X3.g
    public final void b(W3.a aVar) {
        if (!this.f3642f.a().equals(aVar.a())) {
            release();
            l2.e eVar = this.f3638b;
            eVar.n(aVar);
            l lVar = (l) ((HashMap) eVar.f14271c).get(aVar.a());
            if (lVar == null) {
                throw new IllegalStateException(("Could not create SoundPool " + aVar).toString());
            }
            this.f3643g = lVar;
        }
        this.f3642f = aVar;
    }

    @Override // X3.g
    public final void c(float f4, float f5) {
        Integer num = this.f3641e;
        if (num != null) {
            this.f3643g.f3645a.setVolume(num.intValue(), f4, f5);
        }
    }

    @Override // X3.g
    public final void d(Y3.c source) {
        kotlin.jvm.internal.i.e(source, "source");
        source.b(this);
    }

    @Override // X3.g
    public final void e() {
        Integer num = this.f3641e;
        if (num != null) {
            this.f3643g.f3645a.stop(num.intValue());
            this.f3641e = null;
        }
    }

    public final void f(Y3.d dVar) {
        k kVar;
        Y3.d dVar2;
        Throwable th;
        if (dVar != null) {
            synchronized (this.f3643g.f3647c) {
                try {
                    Map map = this.f3643g.f3647c;
                    Object obj = map.get(dVar);
                    if (obj == null) {
                        try {
                            obj = new ArrayList();
                            map.put(dVar, obj);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    List list = (List) obj;
                    k kVar2 = (k) d3.i.d0(list);
                    if (kVar2 != null) {
                        boolean z = kVar2.f3637a.f3664m;
                        this.f3637a.h(z);
                        this.f3640d = kVar2.f3640d;
                        this.f3637a.c("Reusing soundId " + this.f3640d + " for " + dVar + " is prepared=" + z + ' ' + this);
                        kVar = this;
                        dVar2 = dVar;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        this.f3637a.h(false);
                        this.f3637a.c("Fetching actual URL for " + dVar);
                        kVar = this;
                        dVar2 = dVar;
                        try {
                            AbstractC1562w.g(this.f3639c, AbstractC1528C.f15990b, new j(dVar2, kVar, this, currentTimeMillis, null), 2);
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    }
                    list.add(this);
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } else {
            kVar = this;
            dVar2 = dVar;
        }
        kVar.f3644h = dVar2;
    }

    @Override // X3.g
    public final boolean g() {
        return false;
    }

    @Override // X3.g
    public final /* bridge */ /* synthetic */ Integer getCurrentPosition() {
        return null;
    }

    @Override // X3.g
    public final /* bridge */ /* synthetic */ Integer getDuration() {
        return null;
    }

    @Override // X3.g
    public final void h(float f4) {
        Integer num = this.f3641e;
        if (num != null) {
            this.f3643g.f3645a.setRate(num.intValue(), f4);
        }
    }

    @Override // X3.g
    public final void pause() {
        Integer num = this.f3641e;
        if (num != null) {
            this.f3643g.f3645a.pause(num.intValue());
        }
    }

    @Override // X3.g
    public final void release() {
        e();
        Integer num = this.f3640d;
        if (num != null) {
            int intValue = num.intValue();
            Y3.d dVar = this.f3644h;
            if (dVar == null) {
                return;
            }
            synchronized (this.f3643g.f3647c) {
                try {
                    List list = (List) this.f3643g.f3647c.get(dVar);
                    if (list == null) {
                        return;
                    }
                    if ((list.size() == 1 ? list.get(0) : null) == this) {
                        this.f3643g.f3647c.remove(dVar);
                        this.f3643g.f3645a.unload(intValue);
                        this.f3643g.f3646b.remove(num);
                        this.f3637a.c("unloaded soundId " + intValue);
                    } else {
                        list.remove(this);
                    }
                    this.f3640d = null;
                    f(null);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // X3.g
    public final void seekTo(int i4) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("LOW_LATENCY mode does not support: seek");
        }
        Integer num = this.f3641e;
        if (num != null) {
            int intValue = num.intValue();
            e();
            if (this.f3637a.n) {
                this.f3643g.f3645a.resume(intValue);
            }
        }
    }

    @Override // X3.g
    public final void setLooping(boolean z) {
        Integer num = this.f3641e;
        if (num != null) {
            this.f3643g.f3645a.setLoop(num.intValue(), z ? -1 : 0);
        }
    }

    @Override // X3.g
    public final void start() {
        Integer num = this.f3641e;
        Integer num2 = this.f3640d;
        if (num != null) {
            this.f3643g.f3645a.resume(num.intValue());
            return;
        }
        if (num2 != null) {
            SoundPool soundPool = this.f3643g.f3645a;
            int intValue = num2.intValue();
            o oVar = this.f3637a;
            float f4 = oVar.f3658g;
            this.f3641e = Integer.valueOf(soundPool.play(intValue, f4, f4, 0, oVar.f3661j == W3.h.f3484b ? -1 : 0, oVar.f3660i));
        }
    }

    @Override // X3.g
    public final void a() {
    }

    @Override // X3.g
    public final void reset() {
    }
}
