package l5;

import a2.r;
import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Method;
import k5.k;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5869r = 1;

    /* renamed from: s, reason: collision with root package name */
    public final Object f5870s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k5.d dVar, String str) {
        super(dVar, str);
        dVar.getClass();
        str.getClass();
        this.f5870s = dVar.h(str);
    }

    @Override // i5.c
    public boolean A() {
        switch (this.f5869r) {
            case 0:
                return ((e) this.f5870s).A();
            default:
                return super.A();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [hd.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [hd.g, java.lang.Object] */
    @Override // i5.c
    public final boolean E() {
        switch (this.f5869r) {
            case 0:
                e eVar = (e) this.f5870s;
                boolean E = eVar.E();
                boolean equalsIgnoreCase = eVar.k(0).equalsIgnoreCase("wal");
                k5.d dVar = this.f5877d;
                if (!equalsIgnoreCase) {
                    dVar.f5410d.disableWriteAheadLogging();
                    break;
                } else {
                    dVar.f5410d.enableWriteAheadLogging();
                    break;
                }
            case 1:
                a();
                ((k) this.f5870s).f5437e.execute();
                break;
            default:
                int ordinal = ((c) this.f5870s).ordinal();
                k5.d dVar2 = this.f5877d;
                if (ordinal == 0) {
                    dVar2.p();
                    dVar2.i();
                    break;
                } else if (ordinal == 1) {
                    dVar2.i();
                    break;
                } else if (ordinal == 2) {
                    dVar2.a();
                    break;
                } else if (ordinal == 3) {
                    dVar2.d();
                    break;
                } else if (ordinal != 4) {
                    r.p();
                    break;
                } else {
                    SQLiteDatabase sQLiteDatabase = dVar2.f5410d;
                    ?? r32 = k5.d.f5409s;
                    if (((Method) r32.getValue()) != null) {
                        ?? r42 = k5.d.f5408r;
                        if (((Method) r42.getValue()) != null) {
                            Method method = (Method) r32.getValue();
                            method.getClass();
                            Method method2 = (Method) r42.getValue();
                            method2.getClass();
                            Object invoke = method2.invoke(sQLiteDatabase, null);
                            if (invoke == null) {
                                i0.l("Required value was null.");
                                break;
                            } else {
                                method.invoke(invoke, 0, null, 0, null);
                                break;
                            }
                        }
                    }
                    dVar2.a();
                    break;
                }
        }
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.f5869r) {
            case 0:
                ((e) this.f5870s).close();
                break;
            case 1:
                ((k) this.f5870s).close();
                this.f5879i = true;
                break;
            default:
                this.f5879i = true;
                break;
        }
    }

    @Override // i5.c
    public final void f(int i3, long j) {
        switch (this.f5869r) {
            case 0:
                ((e) this.f5870s).f(i3, j);
                return;
            case 1:
                a();
                ((k) this.f5870s).f(i3, j);
                return;
            default:
                a();
                g8.b.L(25, "column index out of range");
                throw null;
        }
    }

    @Override // l5.f, i5.c
    public void g() {
        switch (this.f5869r) {
            case 0:
                ((e) this.f5870s).g();
                break;
            case 1:
                a();
                ((k) this.f5870s).g();
                break;
            default:
                super.g();
                break;
        }
    }

    @Override // i5.c
    public final int getColumnCount() {
        switch (this.f5869r) {
            case 0:
                break;
            case 1:
                a();
                break;
            default:
                a();
                break;
        }
        return 0;
    }

    @Override // i5.c
    public final String getColumnName(int i3) {
        switch (this.f5869r) {
            case 0:
                return ((e) this.f5870s).getColumnName(i3);
            case 1:
                a();
                g8.b.L(21, "no row");
                throw null;
            default:
                a();
                g8.b.L(21, "no row");
                throw null;
        }
    }

    @Override // i5.c
    public final long getLong(int i3) {
        switch (this.f5869r) {
            case 0:
                return ((e) this.f5870s).getLong(i3);
            case 1:
                a();
                g8.b.L(21, "no row");
                throw null;
            default:
                a();
                g8.b.L(21, "no row");
                throw null;
        }
    }

    @Override // i5.c
    public final boolean isNull(int i3) {
        switch (this.f5869r) {
            case 0:
                return ((e) this.f5870s).isNull(i3);
            case 1:
                a();
                g8.b.L(21, "no row");
                throw null;
            default:
                a();
                g8.b.L(21, "no row");
                throw null;
        }
    }

    @Override // i5.c
    public final String k(int i3) {
        switch (this.f5869r) {
            case 0:
                return ((e) this.f5870s).k(i3);
            case 1:
                a();
                g8.b.L(21, "no row");
                throw null;
            default:
                a();
                g8.b.L(21, "no row");
                throw null;
        }
    }

    @Override // i5.c
    public final void q(String str) {
        switch (this.f5869r) {
            case 0:
                str.getClass();
                ((e) this.f5870s).q(str);
                return;
            case 1:
                str.getClass();
                a();
                ((k) this.f5870s).l(2, str);
                return;
            default:
                str.getClass();
                a();
                g8.b.L(25, "column index out of range");
                throw null;
        }
    }

    @Override // l5.f, i5.c
    public void reset() {
        switch (this.f5869r) {
            case 0:
                ((e) this.f5870s).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k5.d dVar, String str, e eVar) {
        super(dVar, str);
        dVar.getClass();
        str.getClass();
        this.f5870s = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k5.d dVar, String str, c cVar) {
        super(dVar, str);
        dVar.getClass();
        str.getClass();
        this.f5870s = cVar;
    }
}
