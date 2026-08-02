package E1;

import android.util.Log;
import android.view.KeyEvent;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import n0.C1125E;

/* loaded from: classes.dex */
public final class z implements C {

    /* renamed from: a, reason: collision with root package name */
    public final P1.f f419a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f420b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f421c;

    /* renamed from: d, reason: collision with root package name */
    public final A2.j f422d;

    public z(P1.f fVar) {
        HashMap hashMap = new HashMap();
        this.f421c = hashMap;
        this.f422d = new A2.j();
        this.f419a = fVar;
        E e3 = H.f317a;
        G g3 = new G();
        g3.f316a = false;
        G g4 = new G[]{g3}[0];
        g4.getClass();
        hashMap.put(4294967556L, g4);
    }

    public final void a(w wVar, final A a3) {
        long j3;
        long j4;
        byte[] bArr = null;
        P1.e eVar = a3 == null ? null : new P1.e() { // from class: E1.x
            @Override // P1.e
            public final void a(ByteBuffer byteBuffer) {
                Boolean bool = Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        bool = Boolean.valueOf(byteBuffer.get() != 0);
                    }
                } else {
                    Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                }
                A.this.a(bool.booleanValue());
            }
        };
        try {
            String str = wVar.f412g;
            if (str != null) {
                bArr = str.getBytes(CharEncoding.UTF_8);
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(wVar.f407a);
            int i3 = wVar.f408b;
            if (i3 == 1) {
                j3 = 0;
            } else if (i3 == 2) {
                j3 = 1;
            } else {
                if (i3 != 3) {
                    throw null;
                }
                j3 = 2;
            }
            allocateDirect.putLong(j3);
            allocateDirect.putLong(wVar.f409c);
            allocateDirect.putLong(wVar.f410d);
            allocateDirect.putLong(wVar.f411e ? 1L : 0L);
            int i4 = wVar.f;
            if (i4 == 1) {
                j4 = 0;
            } else if (i4 == 2) {
                j4 = 1;
            } else if (i4 == 3) {
                j4 = 2;
            } else if (i4 == 4) {
                j4 = 3;
            } else {
                if (i4 != 5) {
                    throw null;
                }
                j4 = 4;
            }
            allocateDirect.putLong(j4);
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f419a.q("flutter/keydata", allocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void b(boolean z, Long l3, Long l4, long j3) {
        w wVar = new w();
        wVar.f407a = j3;
        wVar.f408b = z ? 1 : 2;
        wVar.f410d = l3.longValue();
        wVar.f409c = l4.longValue();
        wVar.f412g = null;
        wVar.f411e = true;
        wVar.f = 1;
        if (l4.longValue() != 0 && l3.longValue() != 0) {
            if (!z) {
                l3 = null;
            }
            c(l4, l3);
        }
        a(wVar, null);
    }

    public final void c(Long l3, Long l4) {
        HashMap hashMap = this.f420b;
        if (l4 != null) {
            if (((Long) hashMap.put(l3, l4)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l3)) == null) {
            throw new AssertionError("The key was empty");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02fe  */
    @Override // E1.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(final KeyEvent keyEvent, A a3) {
        Long l3;
        long j3;
        boolean z;
        Long l4;
        String str;
        int i3;
        G g3;
        int i4;
        boolean[] zArr;
        long j4;
        int i5;
        Boolean[] boolArr;
        HashMap hashMap;
        boolean z2;
        int i6;
        final long j5;
        boolean z3;
        int i7;
        HashMap hashMap2;
        HashMap hashMap3;
        long j6;
        boolean z4;
        int i8;
        z zVar = this;
        long j7 = 0;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            j3 = 0;
        } else {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                l3 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            } else {
                l3 = (Long) H.f317a.get(Long.valueOf(scanCode));
                if (l3 == null) {
                    l3 = Long.valueOf((keyEvent.getScanCode() & 4294967295L) | 73014444032L);
                }
            }
            Long l5 = l3;
            Long l6 = (Long) H.f318b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (l6 == null) {
                l6 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            }
            Long l7 = l6;
            ArrayList arrayList = new ArrayList();
            C1125E[] c1125eArr = H.f319c;
            int length = c1125eArr.length;
            int i9 = 0;
            while (true) {
                HashMap hashMap4 = zVar.f420b;
                int i10 = 2;
                if (i9 >= length) {
                    j3 = j7;
                    HashMap hashMap5 = zVar.f421c;
                    for (G g4 : hashMap5.values()) {
                        int metaState = keyEvent.getMetaState();
                        g4.getClass();
                        boolean z5 = (metaState & 1048576) != 0;
                        if (4294967556L != l7.longValue() && g4.f316a != z5) {
                            boolean containsKey = hashMap4.containsKey(458809L);
                            boolean z6 = !containsKey;
                            if (!containsKey) {
                                g4.f316a = !g4.f316a;
                            }
                            zVar.b(z6, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                g4.f316a = !g4.f316a;
                            }
                            b(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        zVar = this;
                    }
                    int action = keyEvent.getAction();
                    if (action == 0) {
                        z = true;
                    } else if (action != 1) {
                        zVar = this;
                    } else {
                        z = false;
                    }
                    Long l8 = (Long) hashMap4.get(l5);
                    if (z) {
                        if (l8 == null) {
                            i4 = 1;
                            zVar = this;
                        } else if (keyEvent.getRepeatCount() > 0) {
                            zVar = this;
                            i4 = 3;
                        } else {
                            zVar = this;
                            l4 = l5;
                            zVar.b(false, l8, l4, keyEvent.getEventTime());
                            i4 = 1;
                            char charValue = zVar.f422d.a(keyEvent.getUnicodeChar()).charValue();
                            str = charValue == 0 ? "" + charValue : null;
                            i3 = i4;
                        }
                        l4 = l5;
                        char charValue2 = zVar.f422d.a(keyEvent.getUnicodeChar()).charValue();
                        if (charValue2 == 0) {
                        }
                        str = charValue2 == 0 ? "" + charValue2 : null;
                        i3 = i4;
                    } else {
                        zVar = this;
                        l4 = l5;
                        if (l8 != null) {
                            str = null;
                            i3 = 2;
                        }
                    }
                    if (i3 != 3) {
                        zVar.c(l4, z ? l7 : null);
                    }
                    if (i3 == 1 && (g3 = (G) hashMap5.get(l7)) != null) {
                        g3.f316a = !g3.f316a;
                    }
                    w wVar = new w();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        wVar.f = 2;
                    } else if (source == 1025) {
                        wVar.f = 3;
                    } else if (source == 16777232) {
                        wVar.f = 4;
                    } else if (source != 33554433) {
                        wVar.f = 1;
                    } else {
                        wVar.f = 5;
                    }
                    wVar.f407a = keyEvent.getEventTime();
                    wVar.f408b = i3;
                    wVar.f410d = l7.longValue();
                    wVar.f409c = l4.longValue();
                    wVar.f412g = str;
                    wVar.f411e = false;
                    zVar.a(wVar, a3);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                C1125E c1125e = c1125eArr[i9];
                boolean z7 = (keyEvent.getMetaState() & c1125e.f9994a) != 0;
                long longValue = l7.longValue();
                long longValue2 = l5.longValue();
                F[] fArr = (F[]) c1125e.f9995b;
                boolean[] zArr2 = new boolean[2];
                Boolean[] boolArr2 = new Boolean[2];
                long j8 = j7;
                int i11 = 0;
                boolean z8 = false;
                while (i11 < i10) {
                    int i12 = i9;
                    final F f = fArr[i11];
                    boolean containsKey2 = hashMap4.containsKey(Long.valueOf(f.f314a));
                    zArr2[i11] = containsKey2;
                    int i13 = i11;
                    if (f.f315b == longValue) {
                        boolean z9 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 == 0) {
                            i6 = z9 ? 3 : 1;
                        } else {
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i6 = 2;
                        }
                        int b3 = M.j.b(i6);
                        if (b3 != 0) {
                            if (b3 == 1) {
                                zArr = zArr2;
                                hashMap3 = hashMap4;
                                j6 = longValue2;
                                z4 = false;
                                i8 = 2;
                                boolArr = boolArr2;
                                boolArr[i13] = Boolean.valueOf(zArr[i13]);
                            } else if (b3 != 2) {
                                zArr = zArr2;
                                hashMap3 = hashMap4;
                                i8 = 2;
                                j6 = longValue2;
                                z4 = false;
                                boolArr = boolArr2;
                            } else {
                                if (z7) {
                                    zArr = zArr2;
                                    hashMap2 = hashMap4;
                                    i7 = 2;
                                    j5 = longValue2;
                                    z3 = false;
                                    boolArr = boolArr2;
                                } else {
                                    Boolean[] boolArr3 = boolArr2;
                                    final int i14 = 1;
                                    z3 = false;
                                    zArr = zArr2;
                                    hashMap2 = hashMap4;
                                    i7 = 2;
                                    long j9 = longValue2;
                                    boolArr = boolArr3;
                                    j5 = j9;
                                    arrayList.add(new Runnable(this) { // from class: E1.y

                                        /* renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ z f415b;

                                        {
                                            this.f415b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    z zVar2 = this.f415b;
                                                    zVar2.getClass();
                                                    zVar2.b(false, Long.valueOf(f.f315b), Long.valueOf(j5), keyEvent.getEventTime());
                                                    break;
                                                default:
                                                    z zVar3 = this.f415b;
                                                    zVar3.getClass();
                                                    zVar3.b(false, Long.valueOf(f.f315b), Long.valueOf(j5), keyEvent.getEventTime());
                                                    break;
                                            }
                                        }
                                    });
                                }
                                boolArr[i13] = Boolean.valueOf(zArr[i13]);
                            }
                            z2 = z8;
                            i5 = i8;
                            hashMap2 = hashMap3;
                            j4 = j6;
                            hashMap = hashMap2;
                        } else {
                            zArr = zArr2;
                            HashMap hashMap6 = hashMap4;
                            j5 = longValue2;
                            z3 = false;
                            i7 = 2;
                            boolArr = boolArr2;
                            boolArr[i13] = Boolean.FALSE;
                            hashMap2 = hashMap6;
                            if (!z7) {
                                final int i15 = 0;
                                i5 = 2;
                                j4 = j5;
                                arrayList.add(new Runnable(this) { // from class: E1.y

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ z f415b;

                                    {
                                        this.f415b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                z zVar2 = this.f415b;
                                                zVar2.getClass();
                                                zVar2.b(false, Long.valueOf(f.f315b), Long.valueOf(j5), keyEvent.getEventTime());
                                                break;
                                            default:
                                                z zVar3 = this.f415b;
                                                zVar3.getClass();
                                                zVar3.b(false, Long.valueOf(f.f315b), Long.valueOf(j5), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                                z2 = true;
                                hashMap = hashMap2;
                            }
                        }
                        j4 = j5;
                        i5 = i7;
                        z2 = true;
                        hashMap = hashMap2;
                    } else {
                        zArr = zArr2;
                        j4 = longValue2;
                        i5 = 2;
                        boolArr = boolArr2;
                        hashMap = hashMap4;
                        z2 = z8 || containsKey2;
                    }
                    z8 = z2;
                    i11 = i13 + 1;
                    hashMap4 = hashMap;
                    i10 = i5;
                    boolArr2 = boolArr;
                    i9 = i12;
                    longValue2 = j4;
                    zArr2 = zArr;
                }
                boolean[] zArr3 = zArr2;
                int i16 = i9;
                int i17 = i10;
                Boolean[] boolArr4 = boolArr2;
                boolean z10 = keyEvent.getDeviceId() == -1;
                if (z7) {
                    for (int i18 = 0; i18 < i17; i18++) {
                        if (boolArr4[i18] == null) {
                            if (z8 || z10) {
                                boolArr4[i18] = Boolean.valueOf(zArr3[i18]);
                            } else {
                                boolArr4[i18] = Boolean.TRUE;
                                z8 = true;
                            }
                        }
                    }
                    if (!z8 && !z10) {
                        boolArr4[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i19 = 0; i19 < i17; i19++) {
                        if (boolArr4[i19] == null) {
                            boolArr4[i19] = Boolean.FALSE;
                        }
                    }
                }
                for (int i20 = 0; i20 < i17; i20++) {
                    if (zArr3[i20] != boolArr4[i20].booleanValue()) {
                        F f3 = fArr[i20];
                        b(boolArr4[i20].booleanValue(), Long.valueOf(f3.f315b), Long.valueOf(f3.f314a), keyEvent.getEventTime());
                    }
                }
                zVar = this;
                i9 = i16 + 1;
                j7 = j8;
            }
        }
        zVar.b(true, Long.valueOf(j3), Long.valueOf(j3), 0L);
        a3.a(true);
    }
}
