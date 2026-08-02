package E2;

import android.media.SoundPool;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t2.AbstractC1212w;
import t2.D;

/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    public final p f445a;

    /* renamed from: b, reason: collision with root package name */
    public final V0.e f446b;

    /* renamed from: c, reason: collision with root package name */
    public final y2.e f447c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f448d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f449e;
    public D2.a f;

    /* renamed from: g, reason: collision with root package name */
    public m f450g;

    /* renamed from: h, reason: collision with root package name */
    public F2.d f451h;

    public l(p wrappedPlayer, V0.e soundPoolManager) {
        kotlin.jvm.internal.j.e(wrappedPlayer, "wrappedPlayer");
        kotlin.jvm.internal.j.e(soundPoolManager, "soundPoolManager");
        this.f445a = wrappedPlayer;
        this.f446b = soundPoolManager;
        A2.e eVar = D.f10377a;
        this.f447c = AbstractC1212w.a(y2.o.f10862a);
        D2.a aVar = wrappedPlayer.f461c;
        this.f = aVar;
        soundPoolManager.w(aVar);
        D2.a audioContext = this.f;
        kotlin.jvm.internal.j.e(audioContext, "audioContext");
        m mVar = (m) ((HashMap) soundPoolManager.f1600c).get(audioContext.a());
        if (mVar != null) {
            this.f450g = mVar;
        } else {
            throw new IllegalStateException(("Could not create SoundPool " + this.f).toString());
        }
    }

    @Override // E2.h
    public final void a() {
        Integer num = this.f449e;
        Integer num2 = this.f448d;
        if (num != null) {
            this.f450g.f452a.resume(num.intValue());
            return;
        }
        if (num2 != null) {
            SoundPool soundPool = this.f450g.f452a;
            int intValue = num2.intValue();
            p pVar = this.f445a;
            float f = pVar.f464g;
            this.f449e = Integer.valueOf(soundPool.play(intValue, f, f, 0, pVar.f467j == D2.f.f241b ? -1 : 0, pVar.f466i));
        }
    }

    @Override // E2.h
    public final void b() {
        Integer num = this.f449e;
        if (num != null) {
            this.f450g.f452a.pause(num.intValue());
        }
    }

    @Override // E2.h
    public final void c(boolean z) {
        Integer num = this.f449e;
        if (num != null) {
            this.f450g.f452a.setLoop(num.intValue(), z ? -1 : 0);
        }
    }

    public final void d(F2.d dVar) {
        l lVar;
        F2.d dVar2;
        Throwable th;
        if (dVar != null) {
            synchronized (this.f450g.f454c) {
                try {
                    Map map = this.f450g.f454c;
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
                    l lVar2 = (l) c2.e.Q(list);
                    if (lVar2 != null) {
                        boolean z = lVar2.f445a.f470m;
                        this.f445a.h(z);
                        this.f448d = lVar2.f448d;
                        this.f445a.c("Reusing soundId " + this.f448d + " for " + dVar + " is prepared=" + z + ' ' + this);
                        lVar = this;
                        dVar2 = dVar;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        this.f445a.h(false);
                        this.f445a.c("Fetching actual URL for " + dVar);
                        lVar = this;
                        dVar2 = dVar;
                        try {
                            AbstractC1212w.g(this.f447c, D.f10378b, new k(dVar2, lVar, this, currentTimeMillis, null), 2);
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
            lVar = this;
            dVar2 = dVar;
        }
        lVar.f451h = dVar2;
    }

    @Override // E2.h
    public final void e() {
        Integer num = this.f449e;
        if (num != null) {
            this.f450g.f452a.stop(num.intValue());
            this.f449e = null;
        }
    }

    @Override // E2.h
    public final void g(F2.c source) {
        kotlin.jvm.internal.j.e(source, "source");
        source.b(this);
    }

    @Override // E2.h
    public final /* bridge */ /* synthetic */ Integer i() {
        return null;
    }

    @Override // E2.h
    public final boolean j() {
        return false;
    }

    @Override // E2.h
    public final void k(float f) {
        Integer num = this.f449e;
        if (num != null) {
            this.f450g.f452a.setRate(num.intValue(), f);
        }
    }

    @Override // E2.h
    public final void l(D2.a aVar) {
        if (!this.f.a().equals(aVar.a())) {
            release();
            V0.e eVar = this.f446b;
            eVar.w(aVar);
            m mVar = (m) ((HashMap) eVar.f1600c).get(aVar.a());
            if (mVar == null) {
                throw new IllegalStateException(("Could not create SoundPool " + aVar).toString());
            }
            this.f450g = mVar;
        }
        this.f = aVar;
    }

    @Override // E2.h
    public final void m(int i3) {
        if (i3 != 0) {
            throw new UnsupportedOperationException("LOW_LATENCY mode does not support: seek");
        }
        Integer num = this.f449e;
        if (num != null) {
            int intValue = num.intValue();
            e();
            if (this.f445a.f471n) {
                this.f450g.f452a.resume(intValue);
            }
        }
    }

    @Override // E2.h
    public final void o(float f, float f3) {
        Integer num = this.f449e;
        if (num != null) {
            this.f450g.f452a.setVolume(num.intValue(), f, f3);
        }
    }

    @Override // E2.h
    public final /* bridge */ /* synthetic */ Integer p() {
        return null;
    }

    @Override // E2.h
    public final void release() {
        e();
        Integer num = this.f448d;
        if (num != null) {
            int intValue = num.intValue();
            F2.d dVar = this.f451h;
            if (dVar == null) {
                return;
            }
            synchronized (this.f450g.f454c) {
                try {
                    List list = (List) this.f450g.f454c.get(dVar);
                    if (list == null) {
                        return;
                    }
                    if ((list.size() == 1 ? list.get(0) : null) == this) {
                        this.f450g.f454c.remove(dVar);
                        this.f450g.f452a.unload(intValue);
                        this.f450g.f453b.remove(num);
                        this.f445a.c("unloaded soundId " + intValue);
                    } else {
                        list.remove(this);
                    }
                    this.f448d = null;
                    d(null);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // E2.h
    public final void h() {
    }

    @Override // E2.h
    public final void reset() {
    }
}
