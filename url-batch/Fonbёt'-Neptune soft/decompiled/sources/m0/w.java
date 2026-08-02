package m0;

import D0.Z;
import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import w0.InterfaceC0319e;
import w0.InterfaceC0320f;

/* loaded from: classes.dex */
public final class w implements z {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0320f f3216e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f3217f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f3218g;

    /* renamed from: h, reason: collision with root package name */
    public final f1.i f3219h;

    public w(InterfaceC0320f interfaceC0320f) {
        HashMap hashMap = new HashMap();
        this.f3218g = hashMap;
        this.f3219h = new f1.i();
        this.f3216e = interfaceC0320f;
        B b2 = F.f3129a;
        E e2 = new E();
        e2.f3128a = false;
        E e3 = new E[]{e2}[0];
        e3.getClass();
        hashMap.put(4294967556L, e3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c2  */
    @Override // m0.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final KeyEvent keyEvent, x xVar) {
        Long l2;
        boolean z2;
        int i2;
        String str;
        int i3;
        E e2;
        long j2;
        HashMap hashMap;
        Boolean[] boolArr;
        HashMap hashMap2;
        boolean[] zArr;
        int i4;
        int i5;
        boolean z3;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            j2 = 0;
        } else {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                l2 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            } else {
                l2 = (Long) F.f3129a.get(Long.valueOf(scanCode));
                if (l2 == null) {
                    l2 = Long.valueOf((keyEvent.getScanCode() & 4294967295L) | 73014444032L);
                }
            }
            Long l3 = l2;
            Long l4 = (Long) F.f3130b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (l4 == null) {
                l4 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            }
            Long l5 = l4;
            ArrayList arrayList = new ArrayList();
            D[] dArr = F.f3131c;
            int length = dArr.length;
            int i6 = 0;
            while (true) {
                HashMap hashMap3 = this.f3217f;
                if (i6 >= length) {
                    HashMap hashMap4 = hashMap3;
                    HashMap hashMap5 = this.f3218g;
                    for (E e3 : hashMap5.values()) {
                        int metaState = keyEvent.getMetaState();
                        e3.getClass();
                        boolean z4 = (metaState & 1048576) != 0;
                        if (4294967556L == l5.longValue() || e3.f3128a == z4) {
                            hashMap = hashMap4;
                        } else {
                            HashMap hashMap6 = hashMap4;
                            boolean containsKey = hashMap6.containsKey(458809L);
                            boolean z5 = !containsKey;
                            if (!containsKey) {
                                e3.f3128a = !e3.f3128a;
                            }
                            hashMap = hashMap6;
                            c(z5, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                e3.f3128a = !e3.f3128a;
                            }
                            c(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        hashMap4 = hashMap;
                    }
                    HashMap hashMap7 = hashMap4;
                    int action = keyEvent.getAction();
                    if (action != 0) {
                        z2 = action != 1;
                        j2 = 0;
                    }
                    Long l6 = (Long) hashMap7.get(l3);
                    if (z2) {
                        if (l6 != null) {
                            if (keyEvent.getRepeatCount() > 0) {
                                i3 = 3;
                                char charValue = this.f3219h.a(keyEvent.getUnicodeChar()).charValue();
                                str = charValue == 0 ? "" + charValue : null;
                                i2 = 1;
                            } else {
                                c(false, l6, l3, keyEvent.getEventTime());
                            }
                        }
                        i3 = 1;
                        char charValue2 = this.f3219h.a(keyEvent.getUnicodeChar()).charValue();
                        if (charValue2 == 0) {
                        }
                        str = charValue2 == 0 ? "" + charValue2 : null;
                        i2 = 1;
                    } else {
                        if (l6 != null) {
                            i2 = 1;
                            str = null;
                            i3 = 2;
                        }
                        j2 = 0;
                    }
                    if (i3 != 3) {
                        d(l3, z2 ? l5 : null);
                    }
                    if (i3 == i2 && (e2 = (E) hashMap5.get(l5)) != null) {
                        e2.f3128a = (e2.f3128a ? 1 : 0) ^ i2;
                    }
                    t tVar = new t();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        tVar.f3209f = 2;
                    } else if (source == 1025) {
                        tVar.f3209f = 3;
                    } else if (source == 16777232) {
                        tVar.f3209f = 4;
                    } else if (source != 33554433) {
                        tVar.f3209f = 1;
                    } else {
                        tVar.f3209f = 5;
                    }
                    tVar.f3204a = keyEvent.getEventTime();
                    tVar.f3205b = i3;
                    tVar.f3207d = l5.longValue();
                    tVar.f3206c = l3.longValue();
                    tVar.f3210g = str;
                    tVar.f3208e = false;
                    b(tVar, xVar);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                D d2 = dArr[i6];
                boolean z6 = (keyEvent.getMetaState() & d2.f3126a) != 0;
                long longValue = l5.longValue();
                final long longValue2 = l3.longValue();
                C[] cArr = (C[]) d2.f3127b;
                boolean[] zArr2 = new boolean[2];
                Boolean[] boolArr2 = new Boolean[2];
                int i7 = 0;
                boolean z7 = false;
                for (int i8 = 2; i7 < i8; i8 = 2) {
                    final C c2 = cArr[i7];
                    boolean[] zArr3 = zArr2;
                    boolean containsKey2 = hashMap3.containsKey(Long.valueOf(c2.f3124a));
                    zArr3[i7] = containsKey2;
                    int i9 = i7;
                    if (c2.f3125b == longValue) {
                        boolean z8 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 == 0) {
                            i5 = z8 ? 3 : 1;
                        } else {
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i5 = 2;
                        }
                        int b2 = K.j.b(i5);
                        if (b2 != 0) {
                            if (b2 == 1) {
                                boolArr2[i9] = Boolean.valueOf(zArr3[i9]);
                            } else if (b2 == 2) {
                                if (!z6) {
                                    arrayList.add(new Z(this, c2, keyEvent, 4));
                                }
                                boolArr2[i9] = Boolean.valueOf(zArr3[i9]);
                                boolArr = boolArr2;
                                hashMap2 = hashMap3;
                                zArr = zArr3;
                                z3 = true;
                                i4 = i6;
                            }
                            boolArr = boolArr2;
                            hashMap2 = hashMap3;
                            z3 = z7;
                            zArr = zArr3;
                            i4 = i6;
                        } else {
                            boolArr2[i9] = Boolean.FALSE;
                            if (z6) {
                                boolArr = boolArr2;
                                hashMap2 = hashMap3;
                                zArr = zArr3;
                                i4 = i6;
                            } else {
                                boolArr = boolArr2;
                                zArr = zArr3;
                                i4 = i6;
                                hashMap2 = hashMap3;
                                arrayList.add(new Runnable() { // from class: m0.v
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        w wVar = w.this;
                                        wVar.getClass();
                                        wVar.c(false, Long.valueOf(c2.f3125b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                    }
                                });
                            }
                            z3 = true;
                        }
                        z7 = z3;
                    } else {
                        boolArr = boolArr2;
                        hashMap2 = hashMap3;
                        zArr = zArr3;
                        i4 = i6;
                        z7 = z7 || containsKey2;
                    }
                    i7 = i9 + 1;
                    zArr2 = zArr;
                    boolArr2 = boolArr;
                    i6 = i4;
                    hashMap3 = hashMap2;
                }
                Boolean[] boolArr3 = boolArr2;
                boolean[] zArr4 = zArr2;
                int i10 = i6;
                if (z6) {
                    for (int i11 = 0; i11 < 2; i11++) {
                        if (boolArr3[i11] == null) {
                            if (z7) {
                                boolArr3[i11] = Boolean.valueOf(zArr4[i11]);
                            } else {
                                boolArr3[i11] = Boolean.TRUE;
                                z7 = true;
                            }
                        }
                    }
                    if (!z7) {
                        boolArr3[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i12 = 0; i12 < 2; i12++) {
                        if (boolArr3[i12] == null) {
                            boolArr3[i12] = Boolean.FALSE;
                        }
                    }
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    if (zArr4[i13] != boolArr3[i13].booleanValue()) {
                        C c3 = cArr[i13];
                        c(boolArr3[i13].booleanValue(), Long.valueOf(c3.f3125b), Long.valueOf(c3.f3124a), keyEvent.getEventTime());
                    }
                }
                i6 = i10 + 1;
            }
        }
        c(true, Long.valueOf(j2), Long.valueOf(j2), 0L);
        xVar.a(true);
    }

    public final void b(t tVar, final x xVar) {
        long j2;
        long j3;
        byte[] bArr = null;
        InterfaceC0319e interfaceC0319e = xVar == null ? null : new InterfaceC0319e() { // from class: m0.u
            @Override // w0.InterfaceC0319e
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
                x.this.a(bool.booleanValue());
            }
        };
        try {
            String str = tVar.f3210g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(tVar.f3204a);
            int i2 = tVar.f3205b;
            if (i2 == 1) {
                j2 = 0;
            } else if (i2 == 2) {
                j2 = 1;
            } else {
                if (i2 != 3) {
                    throw null;
                }
                j2 = 2;
            }
            allocateDirect.putLong(j2);
            allocateDirect.putLong(tVar.f3206c);
            allocateDirect.putLong(tVar.f3207d);
            allocateDirect.putLong(tVar.f3208e ? 1L : 0L);
            int i3 = tVar.f3209f;
            if (i3 == 1) {
                j3 = 0;
            } else if (i3 == 2) {
                j3 = 1;
            } else if (i3 == 3) {
                j3 = 2;
            } else if (i3 == 4) {
                j3 = 3;
            } else {
                if (i3 != 5) {
                    throw null;
                }
                j3 = 4;
            }
            allocateDirect.putLong(j3);
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f3216e.c("flutter/keydata", allocateDirect, interfaceC0319e);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void c(boolean z2, Long l2, Long l3, long j2) {
        t tVar = new t();
        tVar.f3204a = j2;
        tVar.f3205b = z2 ? 1 : 2;
        tVar.f3207d = l2.longValue();
        tVar.f3206c = l3.longValue();
        tVar.f3210g = null;
        tVar.f3208e = true;
        tVar.f3209f = 1;
        if (l3.longValue() != 0 && l2.longValue() != 0) {
            if (!z2) {
                l2 = null;
            }
            d(l3, l2);
        }
        b(tVar, null);
    }

    public final void d(Long l2, Long l3) {
        HashMap hashMap = this.f3217f;
        if (l3 != null) {
            if (((Long) hashMap.put(l2, l3)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l2)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
