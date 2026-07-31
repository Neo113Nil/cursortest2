package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.n;
import io.flutter.embedding.android.q;
import io.flutter.embedding.android.r;
import java.nio.ByteBuffer;
import java.util.HashMap;
import m5.c;

/* loaded from: classes.dex */
public class p implements q.d {

    /* renamed from: a, reason: collision with root package name */
    private final m5.c f17166a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<Long, Long> f17167b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<Long, r.e> f17168c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final q.b f17169d = new q.b();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17170a;

        static {
            int[] iArr = new int[n.a.values().length];
            f17170a = iArr;
            try {
                iArr[n.a.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17170a[n.a.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17170a[n.a.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public p(m5.c cVar) {
        this.f17166a = cVar;
        for (r.e eVar : r.a()) {
            this.f17168c.put(Long.valueOf(eVar.f17190c), eVar);
        }
    }

    private static n.a c(KeyEvent keyEvent) {
        boolean z6 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z6 ? n.a.kRepeat : n.a.kDown;
        }
        if (action == 1) {
            return n.a.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    private Long d(KeyEvent keyEvent) {
        Long l7 = r.f17182b.get(Long.valueOf(keyEvent.getKeyCode()));
        return l7 != null ? l7 : Long.valueOf(g(keyEvent.getKeyCode(), 73014444032L));
    }

    private Long e(KeyEvent keyEvent) {
        int scanCode;
        long scanCode2 = keyEvent.getScanCode();
        if (scanCode2 == 0) {
            scanCode = keyEvent.getKeyCode();
        } else {
            Long l7 = r.f17181a.get(Long.valueOf(scanCode2));
            if (l7 != null) {
                return l7;
            }
            scanCode = keyEvent.getScanCode();
        }
        return Long.valueOf(g(scanCode, 73014444032L));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean f(KeyEvent keyEvent, q.d.a aVar) {
        boolean z6;
        n.a aVar2;
        String str;
        r.e eVar;
        char charValue;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            return false;
        }
        Long e7 = e(keyEvent);
        Long d7 = d(keyEvent);
        for (r.d dVar : r.f17183c) {
            j(dVar, (keyEvent.getMetaState() & dVar.f17186a) != 0, d7.longValue(), keyEvent);
        }
        for (r.e eVar2 : this.f17168c.values()) {
            k(eVar2, (keyEvent.getMetaState() & eVar2.f17188a) != 0, d7.longValue(), keyEvent);
        }
        int action = keyEvent.getAction();
        if (action == 0) {
            z6 = true;
        } else {
            if (action != 1) {
                return false;
            }
            z6 = false;
        }
        Long l7 = this.f17167b.get(e7);
        if (z6) {
            if (l7 != null) {
                if (keyEvent.getRepeatCount() > 0) {
                    aVar2 = n.a.kRepeat;
                    charValue = this.f17169d.a(keyEvent.getUnicodeChar()).charValue();
                    if (charValue != 0) {
                        str = "" + charValue;
                        if (aVar2 != n.a.kRepeat) {
                            m(e7, z6 ? d7 : null);
                        }
                        if (aVar2 == n.a.kDown && (eVar = this.f17168c.get(d7)) != null) {
                            eVar.f17191d = !eVar.f17191d;
                        }
                        n nVar = new n();
                        nVar.f17154a = keyEvent.getEventTime();
                        nVar.f17155b = aVar2;
                        nVar.f17157d = d7.longValue();
                        nVar.f17156c = e7.longValue();
                        nVar.f17159f = str;
                        nVar.f17158e = false;
                        i(nVar, aVar);
                        return true;
                    }
                } else {
                    l(false, l7, e7, keyEvent.getEventTime());
                }
            }
            aVar2 = n.a.kDown;
            charValue = this.f17169d.a(keyEvent.getUnicodeChar()).charValue();
            if (charValue != 0) {
            }
        } else {
            if (l7 == null) {
                return false;
            }
            aVar2 = n.a.kUp;
        }
        str = null;
        if (aVar2 != n.a.kRepeat) {
        }
        if (aVar2 == n.a.kDown) {
            eVar.f17191d = !eVar.f17191d;
        }
        n nVar2 = new n();
        nVar2.f17154a = keyEvent.getEventTime();
        nVar2.f17155b = aVar2;
        nVar2.f17157d = d7.longValue();
        nVar2.f17156c = e7.longValue();
        nVar2.f17159f = str;
        nVar2.f17158e = false;
        i(nVar2, aVar);
        return true;
    }

    private static long g(long j7, long j8) {
        return (j7 & 4294967295L) | j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(q.d.a aVar, ByteBuffer byteBuffer) {
        Boolean bool = Boolean.FALSE;
        byteBuffer.rewind();
        if (byteBuffer.capacity() != 0) {
            bool = Boolean.valueOf(byteBuffer.get() != 0);
        }
        aVar.a(bool.booleanValue());
    }

    private void i(n nVar, final q.d.a aVar) {
        this.f17166a.c("flutter/keydata", nVar.a(), aVar == null ? null : new c.b() { // from class: io.flutter.embedding.android.o
            @Override // m5.c.b
            public final void a(ByteBuffer byteBuffer) {
                p.h(q.d.a.this, byteBuffer);
            }
        });
    }

    private void l(boolean z6, Long l7, Long l8, long j7) {
        n nVar = new n();
        nVar.f17154a = j7;
        nVar.f17155b = z6 ? n.a.kDown : n.a.kUp;
        nVar.f17157d = l7.longValue();
        nVar.f17156c = l8.longValue();
        nVar.f17159f = null;
        nVar.f17158e = true;
        if (l8.longValue() != 0 && l7.longValue() != 0) {
            if (!z6) {
                l7 = null;
            }
            m(l8, l7);
        }
        i(nVar, null);
    }

    @Override // io.flutter.embedding.android.q.d
    public void a(KeyEvent keyEvent, q.d.a aVar) {
        if (f(keyEvent, aVar)) {
            return;
        }
        l(true, 0L, 0L, 0L);
        aVar.a(true);
    }

    void j(r.d dVar, boolean z6, long j7, KeyEvent keyEvent) {
        r.c[] cVarArr = dVar.f17187b;
        boolean[] zArr = new boolean[cVarArr.length];
        Boolean[] boolArr = new Boolean[cVarArr.length];
        int i7 = 0;
        boolean z7 = false;
        while (true) {
            r.c[] cVarArr2 = dVar.f17187b;
            boolean z8 = true;
            if (i7 >= cVarArr2.length) {
                if (z6) {
                    for (int i8 = 0; i8 < dVar.f17187b.length; i8++) {
                        if (boolArr[i8] == null) {
                            if (z7) {
                                boolArr[i8] = Boolean.valueOf(zArr[i8]);
                            } else {
                                boolArr[i8] = Boolean.TRUE;
                                z7 = true;
                            }
                        }
                    }
                    if (!z7) {
                        boolArr[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i9 = 0; i9 < dVar.f17187b.length; i9++) {
                        if (boolArr[i9] == null) {
                            boolArr[i9] = Boolean.FALSE;
                        }
                    }
                }
                for (int i10 = 0; i10 < dVar.f17187b.length; i10++) {
                    if (zArr[i10] != boolArr[i10].booleanValue()) {
                        r.c cVar = dVar.f17187b[i10];
                        l(boolArr[i10].booleanValue(), Long.valueOf(cVar.f17185b), Long.valueOf(cVar.f17184a), keyEvent.getEventTime());
                    }
                }
                return;
            }
            zArr[i7] = this.f17167b.containsKey(Long.valueOf(cVarArr2[i7].f17184a));
            if (dVar.f17187b[i7].f17185b == j7) {
                int i11 = a.f17170a[c(keyEvent).ordinal()];
                if (i11 == 1) {
                    boolArr[i7] = Boolean.FALSE;
                    if (!z6) {
                        throw new AssertionError(String.format("Unexpected metaState 0 for key 0x%x during an ACTION_down event.", Long.valueOf(j7)));
                    }
                } else if (i11 == 2) {
                    boolArr[i7] = Boolean.valueOf(zArr[i7]);
                } else if (i11 != 3) {
                    continue;
                } else {
                    if (!z6) {
                        throw new AssertionError(String.format("Unexpected metaState 0 for key 0x%x during an ACTION_down repeat event.", Long.valueOf(j7)));
                    }
                    boolArr[i7] = Boolean.valueOf(zArr[i7]);
                }
                z7 = true;
            } else {
                if (!z7 && !zArr[i7]) {
                    z8 = false;
                }
                z7 = z8;
            }
            i7++;
        }
    }

    void k(r.e eVar, boolean z6, long j7, KeyEvent keyEvent) {
        if (eVar.f17190c == j7 || eVar.f17191d == z6) {
            return;
        }
        boolean z7 = !this.f17167b.containsKey(Long.valueOf(eVar.f17189b));
        if (z7) {
            eVar.f17191d = !eVar.f17191d;
        }
        l(z7, Long.valueOf(eVar.f17190c), Long.valueOf(eVar.f17189b), keyEvent.getEventTime());
        if (!z7) {
            eVar.f17191d = !eVar.f17191d;
        }
        l(!z7, Long.valueOf(eVar.f17190c), Long.valueOf(eVar.f17189b), keyEvent.getEventTime());
    }

    void m(Long l7, Long l8) {
        if (l8 != null) {
            if (this.f17167b.put(l7, l8) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (this.f17167b.remove(l7) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
