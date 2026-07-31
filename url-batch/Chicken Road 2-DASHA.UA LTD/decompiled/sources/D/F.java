package D;

import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import n.AbstractC0077d;

/* loaded from: classes.dex */
public final class F implements J {

    /* renamed from: b, reason: collision with root package name */
    public final N.f f30b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f31c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f32d;

    /* renamed from: e, reason: collision with root package name */
    public final G f33e;

    public F(N.f fVar) {
        HashMap hashMap = new HashMap();
        this.f32d = hashMap;
        this.f33e = new G();
        this.f30b = fVar;
        K k2 = O.f46a;
        N n2 = new N();
        n2.f45a = false;
        N n3 = new N[]{n2}[0];
        n3.getClass();
        hashMap.put(4294967556L, n3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02eb  */
    @Override // D.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final KeyEvent keyEvent, H h2) {
        Long l2;
        boolean z2;
        int i2;
        int i3;
        String str;
        N n2;
        long j2;
        HashMap hashMap;
        int i4;
        boolean[] zArr;
        HashMap hashMap2;
        int i5;
        M[] mArr;
        L[] lArr;
        int i6;
        int i7;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            j2 = 0;
        } else {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                l2 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            } else {
                l2 = (Long) O.f46a.get(Long.valueOf(scanCode));
                if (l2 == null) {
                    l2 = Long.valueOf((keyEvent.getScanCode() & 4294967295L) | 73014444032L);
                }
            }
            Long l3 = l2;
            Long l4 = (Long) O.f47b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (l4 == null) {
                l4 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            }
            Long l5 = l4;
            ArrayList arrayList = new ArrayList();
            M[] mArr2 = O.f48c;
            int length = mArr2.length;
            int i8 = 0;
            while (true) {
                HashMap hashMap3 = this.f31c;
                if (i8 >= length) {
                    HashMap hashMap4 = hashMap3;
                    boolean z3 = false;
                    HashMap hashMap5 = this.f32d;
                    for (N n3 : hashMap5.values()) {
                        int metaState = keyEvent.getMetaState();
                        n3.getClass();
                        boolean z4 = (metaState & 1048576) != 0 ? true : z3;
                        if (4294967556L == l5.longValue() || n3.f45a == z4) {
                            hashMap = hashMap4;
                        } else {
                            HashMap hashMap6 = hashMap4;
                            boolean containsKey = hashMap6.containsKey(458809L);
                            boolean z5 = !containsKey;
                            if (!containsKey) {
                                n3.f45a = !n3.f45a;
                            }
                            hashMap = hashMap6;
                            c(z5, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                n3.f45a = !n3.f45a;
                            }
                            c(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        hashMap4 = hashMap;
                        z3 = false;
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
                                char charValue = this.f33e.a(keyEvent.getUnicodeChar()).charValue();
                                str = charValue == 0 ? "" + charValue : null;
                                i2 = 1;
                            } else {
                                c(false, l6, l3, keyEvent.getEventTime());
                            }
                        }
                        i3 = 1;
                        char charValue2 = this.f33e.a(keyEvent.getUnicodeChar()).charValue();
                        if (charValue2 == 0) {
                        }
                        str = charValue2 == 0 ? "" + charValue2 : null;
                        i2 = 1;
                    } else {
                        if (l6 != null) {
                            i2 = 1;
                            i3 = 2;
                            str = null;
                        }
                        j2 = 0;
                    }
                    if (i3 != 3) {
                        d(l3, z2 ? l5 : null);
                    }
                    if (i3 == i2 && (n2 = (N) hashMap5.get(l5)) != null) {
                        n2.f45a = (n2.f45a ? 1 : 0) ^ i2;
                    }
                    C c2 = new C();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        c2.f22f = 2;
                    } else if (source == 1025) {
                        c2.f22f = 3;
                    } else if (source == 16777232) {
                        c2.f22f = 4;
                    } else if (source != 33554433) {
                        c2.f22f = 1;
                    } else {
                        c2.f22f = 5;
                    }
                    c2.f17a = keyEvent.getEventTime();
                    c2.f18b = i3;
                    c2.f20d = l5.longValue();
                    c2.f19c = l3.longValue();
                    c2.f23g = str;
                    c2.f21e = false;
                    b(c2, h2);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                M m2 = mArr2[i8];
                boolean z6 = (keyEvent.getMetaState() & m2.f43a) != 0;
                long longValue = l5.longValue();
                final long longValue2 = l3.longValue();
                L[] lArr2 = m2.f44b;
                boolean[] zArr2 = new boolean[2];
                Boolean[] boolArr = new Boolean[2];
                int i9 = 0;
                boolean z7 = false;
                for (int i10 = 2; i9 < i10; i10 = 2) {
                    final L l7 = lArr2[i9];
                    L[] lArr3 = lArr2;
                    boolean containsKey2 = hashMap3.containsKey(Long.valueOf(l7.f41a));
                    zArr2[i9] = containsKey2;
                    Boolean[] boolArr2 = boolArr;
                    if (l7.f42b == longValue) {
                        boolean z8 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 == 0) {
                            i7 = z8 ? 3 : 1;
                        } else {
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i7 = 2;
                        }
                        int a2 = AbstractC0077d.a(i7);
                        if (a2 == 0) {
                            zArr = zArr2;
                            hashMap2 = hashMap3;
                            i5 = length;
                            mArr = mArr2;
                            lArr = lArr3;
                            i6 = i8;
                            boolArr2[i9] = Boolean.FALSE;
                            if (!z6) {
                                final int i11 = 0;
                                arrayList.add(new Runnable(this) { // from class: D.E

                                    /* renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ F f26c;

                                    {
                                        this.f26c = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                F f2 = this.f26c;
                                                f2.getClass();
                                                f2.c(false, Long.valueOf(l7.f42b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                F f3 = this.f26c;
                                                f3.getClass();
                                                f3.c(false, Long.valueOf(l7.f42b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (a2 == 1) {
                            zArr = zArr2;
                            hashMap2 = hashMap3;
                            i5 = length;
                            mArr = mArr2;
                            lArr = lArr3;
                            i6 = i8;
                            boolArr2[i9] = Boolean.valueOf(zArr[i9]);
                        } else if (a2 != 2) {
                            zArr = zArr2;
                            hashMap2 = hashMap3;
                            i5 = length;
                            mArr = mArr2;
                            lArr = lArr3;
                            i6 = i8;
                        } else {
                            if (z6) {
                                zArr = zArr2;
                                hashMap2 = hashMap3;
                                i5 = length;
                                mArr = mArr2;
                                lArr = lArr3;
                                i6 = i8;
                            } else {
                                final int i12 = 1;
                                zArr = zArr2;
                                lArr = lArr3;
                                i6 = i8;
                                hashMap2 = hashMap3;
                                mArr = mArr2;
                                i5 = length;
                                arrayList.add(new Runnable(this) { // from class: D.E

                                    /* renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ F f26c;

                                    {
                                        this.f26c = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                F f2 = this.f26c;
                                                f2.getClass();
                                                f2.c(false, Long.valueOf(l7.f42b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                F f3 = this.f26c;
                                                f3.getClass();
                                                f3.c(false, Long.valueOf(l7.f42b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                            boolArr2[i9] = Boolean.valueOf(zArr[i9]);
                        }
                        z7 = true;
                    } else {
                        zArr = zArr2;
                        hashMap2 = hashMap3;
                        i5 = length;
                        mArr = mArr2;
                        lArr = lArr3;
                        i6 = i8;
                        z7 = z7 || containsKey2;
                    }
                    i9++;
                    lArr2 = lArr;
                    length = i5;
                    zArr2 = zArr;
                    i8 = i6;
                    boolArr = boolArr2;
                    mArr2 = mArr;
                    hashMap3 = hashMap2;
                }
                boolean[] zArr3 = zArr2;
                L[] lArr4 = lArr2;
                int i13 = i8;
                int i14 = length;
                Boolean[] boolArr3 = boolArr;
                M[] mArr3 = mArr2;
                if (z6) {
                    i4 = 2;
                    for (int i15 = 0; i15 < 2; i15++) {
                        if (boolArr3[i15] == null) {
                            if (z7) {
                                boolArr3[i15] = Boolean.valueOf(zArr3[i15]);
                            } else {
                                boolArr3[i15] = Boolean.TRUE;
                                z7 = true;
                            }
                        }
                    }
                    if (!z7) {
                        boolArr3[0] = Boolean.TRUE;
                    }
                } else {
                    i4 = 2;
                    for (int i16 = 0; i16 < 2; i16++) {
                        if (boolArr3[i16] == null) {
                            boolArr3[i16] = Boolean.FALSE;
                        }
                    }
                }
                for (int i17 = 0; i17 < i4; i17++) {
                    if (zArr3[i17] != boolArr3[i17].booleanValue()) {
                        L l8 = lArr4[i17];
                        c(boolArr3[i17].booleanValue(), Long.valueOf(l8.f42b), Long.valueOf(l8.f41a), keyEvent.getEventTime());
                    }
                }
                i8 = i13 + 1;
                length = i14;
                mArr2 = mArr3;
            }
        }
        c(true, Long.valueOf(j2), Long.valueOf(j2), 0L);
        h2.a(true);
    }

    public final void b(C c2, final H h2) {
        long j2;
        long j3;
        byte[] bArr = null;
        N.e eVar = h2 == null ? null : new N.e() { // from class: D.D
            @Override // N.e
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
                H.this.a(bool.booleanValue());
            }
        };
        try {
            String str = c2.f23g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(c2.f17a);
            int i2 = c2.f18b;
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
            allocateDirect.putLong(c2.f19c);
            allocateDirect.putLong(c2.f20d);
            allocateDirect.putLong(c2.f21e ? 1L : 0L);
            int i3 = c2.f22f;
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
            this.f30b.f("flutter/keydata", allocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void c(boolean z2, Long l2, Long l3, long j2) {
        C c2 = new C();
        c2.f17a = j2;
        c2.f18b = z2 ? 1 : 2;
        c2.f20d = l2.longValue();
        c2.f19c = l3.longValue();
        c2.f23g = null;
        c2.f21e = true;
        c2.f22f = 1;
        if (l3.longValue() != 0 && l2.longValue() != 0) {
            if (!z2) {
                l2 = null;
            }
            d(l3, l2);
        }
        b(c2, null);
    }

    public final void d(Long l2, Long l3) {
        HashMap hashMap = this.f31c;
        if (l3 != null) {
            if (((Long) hashMap.put(l2, l3)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l2)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
