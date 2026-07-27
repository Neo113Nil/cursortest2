package m5;

import D4.AbstractC0024y;
import D4.E;
import I4.o;
import android.media.SoundPool;
import g4.AbstractC0465j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    public final n f11235a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.c f11236b;

    /* renamed from: c, reason: collision with root package name */
    public final I4.e f11237c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f11238d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f11239e;

    /* renamed from: f, reason: collision with root package name */
    public l5.a f11240f;

    /* renamed from: g, reason: collision with root package name */
    public m f11241g;

    /* renamed from: h, reason: collision with root package name */
    public n5.d f11242h;

    public l(n wrappedPlayer, B0.c soundPoolManager) {
        kotlin.jvm.internal.i.e(wrappedPlayer, "wrappedPlayer");
        kotlin.jvm.internal.i.e(soundPoolManager, "soundPoolManager");
        this.f11235a = wrappedPlayer;
        this.f11236b = soundPoolManager;
        K4.d dVar = E.f459a;
        this.f11237c = AbstractC0024y.b(o.f1316a);
        l5.a aVar = wrappedPlayer.f11248c;
        this.f11240f = aVar;
        soundPoolManager.d(aVar);
        l5.a audioContext = this.f11240f;
        kotlin.jvm.internal.i.e(audioContext, "audioContext");
        m mVar = (m) ((HashMap) soundPoolManager.f141c).get(audioContext.a());
        if (mVar != null) {
            this.f11241g = mVar;
        } else {
            throw new IllegalStateException(("Could not create SoundPool " + this.f11240f).toString());
        }
    }

    @Override // m5.h
    public final void a() {
        Integer num = this.f11239e;
        if (num != null) {
            this.f11241g.f11243a.pause(num.intValue());
        }
    }

    @Override // m5.h
    public final void b(boolean z) {
        Integer num = this.f11239e;
        if (num != null) {
            this.f11241g.f11243a.setLoop(num.intValue(), z ? -1 : 0);
        }
    }

    @Override // m5.h
    public final void c(n5.c source) {
        kotlin.jvm.internal.i.e(source, "source");
        source.a(this);
    }

    @Override // m5.h
    public final /* bridge */ /* synthetic */ Integer e() {
        return null;
    }

    @Override // m5.h
    public final boolean f() {
        return false;
    }

    @Override // m5.h
    public final void g(float f3) {
        Integer num = this.f11239e;
        if (num != null) {
            this.f11241g.f11243a.setRate(num.intValue(), f3);
        }
    }

    @Override // m5.h
    public final void h(int i2) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("LOW_LATENCY mode does not support: seek");
        }
        Integer num = this.f11239e;
        if (num != null) {
            int intValue = num.intValue();
            stop();
            if (this.f11235a.f11259n) {
                this.f11241g.f11243a.resume(intValue);
            }
        }
    }

    @Override // m5.h
    public final void i(l5.a aVar) {
        if (!this.f11240f.a().equals(aVar.a())) {
            release();
            B0.c cVar = this.f11236b;
            cVar.d(aVar);
            m mVar = (m) ((HashMap) cVar.f141c).get(aVar.a());
            if (mVar == null) {
                throw new IllegalStateException(("Could not create SoundPool " + aVar).toString());
            }
            this.f11241g = mVar;
        }
        this.f11240f = aVar;
    }

    public final void j(n5.d dVar) {
        if (dVar != null) {
            synchronized (this.f11241g.f11245c) {
                try {
                    Map map = this.f11241g.f11245c;
                    Object obj = map.get(dVar);
                    if (obj == null) {
                        obj = new ArrayList();
                        map.put(dVar, obj);
                    }
                    List list = (List) obj;
                    l lVar = (l) AbstractC0465j.G0(list);
                    if (lVar != null) {
                        boolean z = lVar.f11235a.f11258m;
                        this.f11235a.h(z);
                        this.f11238d = lVar.f11238d;
                        this.f11235a.c("Reusing soundId " + this.f11238d + " for " + dVar + " is prepared=" + z + ' ' + this);
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        this.f11235a.h(false);
                        this.f11235a.c("Fetching actual URL for " + dVar);
                        AbstractC0024y.n(this.f11237c, E.f461c, 0, new k(dVar, this, this, currentTimeMillis, null), 2);
                    }
                    list.add(this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f11242h = dVar;
    }

    @Override // m5.h
    public final void k(float f3, float f6) {
        Integer num = this.f11239e;
        if (num != null) {
            this.f11241g.f11243a.setVolume(num.intValue(), f3, f6);
        }
    }

    @Override // m5.h
    public final /* bridge */ /* synthetic */ Integer m() {
        return null;
    }

    @Override // m5.h
    public final void release() {
        stop();
        Integer num = this.f11238d;
        if (num != null) {
            int intValue = num.intValue();
            n5.d dVar = this.f11242h;
            if (dVar == null) {
                return;
            }
            synchronized (this.f11241g.f11245c) {
                try {
                    List list = (List) this.f11241g.f11245c.get(dVar);
                    if (list == null) {
                        return;
                    }
                    if ((list.size() == 1 ? list.get(0) : null) == this) {
                        this.f11241g.f11245c.remove(dVar);
                        this.f11241g.f11243a.unload(intValue);
                        this.f11241g.f11244b.remove(num);
                        this.f11235a.c("unloaded soundId " + intValue);
                    } else {
                        list.remove(this);
                    }
                    this.f11238d = null;
                    j(null);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // m5.h
    public final void start() {
        Integer num = this.f11239e;
        Integer num2 = this.f11238d;
        if (num != null) {
            this.f11241g.f11243a.resume(num.intValue());
            return;
        }
        if (num2 != null) {
            SoundPool soundPool = this.f11241g.f11243a;
            int intValue = num2.intValue();
            n nVar = this.f11235a;
            float f3 = nVar.f11252g;
            this.f11239e = Integer.valueOf(soundPool.play(intValue, f3, f3, 0, nVar.f11255j == l5.e.f11079b ? -1 : 0, nVar.f11254i));
        }
    }

    @Override // m5.h
    public final void stop() {
        Integer num = this.f11239e;
        if (num != null) {
            this.f11241g.f11243a.stop(num.intValue());
            this.f11239e = null;
        }
    }

    @Override // m5.h
    public final void d() {
    }

    @Override // m5.h
    public final void n() {
    }
}
