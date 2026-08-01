package E;

import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m.AbstractC0068d;

/* loaded from: classes.dex */
public final class C implements G {

    /* renamed from: b, reason: collision with root package name */
    public final N.f f108b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f109c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f110d;

    /* renamed from: e, reason: collision with root package name */
    public final D f111e;

    public C(N.f fVar) {
        HashMap hashMap = new HashMap();
        this.f110d = hashMap;
        this.f111e = new D();
        this.f108b = fVar;
        H h2 = L.f124a;
        K k2 = new K();
        k2.f123a = false;
        K k3 = new K[]{k2}[0];
        k3.getClass();
        hashMap.put(4294967556L, k3);
    }

    public final void a(z zVar, final E e2) {
        long j2;
        long j3;
        byte[] bArr = null;
        N.e eVar = e2 == null ? null : new N.e() { // from class: E.A
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
                E.this.a(bool.booleanValue());
            }
        };
        try {
            String str = zVar.f220g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(zVar.f214a);
            int i2 = zVar.f215b;
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
            allocateDirect.putLong(zVar.f216c);
            allocateDirect.putLong(zVar.f217d);
            allocateDirect.putLong(zVar.f218e ? 1L : 0L);
            int i3 = zVar.f219f;
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
            this.f108b.i("flutter/keydata", allocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void b(boolean z, Long l2, Long l3, long j2) {
        z zVar = new z();
        zVar.f214a = j2;
        zVar.f215b = z ? 1 : 2;
        zVar.f217d = l2.longValue();
        zVar.f216c = l3.longValue();
        zVar.f220g = null;
        zVar.f218e = true;
        zVar.f219f = 1;
        if (l3.longValue() != 0 && l2.longValue() != 0) {
            if (!z) {
                l2 = null;
            }
            d(l3, l2);
        }
        a(zVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02eb  */
    @Override // E.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final KeyEvent keyEvent, E e2) {
        Long l2;
        boolean z;
        int i2;
        int i3;
        String str;
        K k2;
        long j2;
        HashMap hashMap;
        int i4;
        boolean[] zArr;
        HashMap hashMap2;
        int i5;
        J[] jArr;
        I[] iArr;
        int i6;
        int i7;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            j2 = 0;
        } else {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                l2 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            } else {
                l2 = (Long) L.f124a.get(Long.valueOf(scanCode));
                if (l2 == null) {
                    l2 = Long.valueOf((keyEvent.getScanCode() & 4294967295L) | 73014444032L);
                }
            }
            Long l3 = l2;
            Long l4 = (Long) L.f125b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (l4 == null) {
                l4 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            }
            Long l5 = l4;
            ArrayList arrayList = new ArrayList();
            J[] jArr2 = L.f126c;
            int length = jArr2.length;
            int i8 = 0;
            while (true) {
                HashMap hashMap3 = this.f109c;
                if (i8 >= length) {
                    HashMap hashMap4 = hashMap3;
                    boolean z2 = false;
                    HashMap hashMap5 = this.f110d;
                    for (K k3 : hashMap5.values()) {
                        int metaState = keyEvent.getMetaState();
                        k3.getClass();
                        boolean z3 = (metaState & 1048576) != 0 ? true : z2;
                        if (4294967556L == l5.longValue() || k3.f123a == z3) {
                            hashMap = hashMap4;
                        } else {
                            HashMap hashMap6 = hashMap4;
                            boolean containsKey = hashMap6.containsKey(458809L);
                            boolean z4 = !containsKey;
                            if (!containsKey) {
                                k3.f123a = !k3.f123a;
                            }
                            hashMap = hashMap6;
                            b(z4, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                k3.f123a = !k3.f123a;
                            }
                            b(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        hashMap4 = hashMap;
                        z2 = false;
                    }
                    HashMap hashMap7 = hashMap4;
                    int action = keyEvent.getAction();
                    if (action != 0) {
                        z = action != 1;
                        j2 = 0;
                    }
                    Long l6 = (Long) hashMap7.get(l3);
                    if (z) {
                        if (l6 != null) {
                            if (keyEvent.getRepeatCount() > 0) {
                                i3 = 3;
                                char charValue = this.f111e.a(keyEvent.getUnicodeChar()).charValue();
                                str = charValue == 0 ? "" + charValue : null;
                                i2 = 1;
                            } else {
                                b(false, l6, l3, keyEvent.getEventTime());
                            }
                        }
                        i3 = 1;
                        char charValue2 = this.f111e.a(keyEvent.getUnicodeChar()).charValue();
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
                        d(l3, z ? l5 : null);
                    }
                    if (i3 == i2 && (k2 = (K) hashMap5.get(l5)) != null) {
                        k2.f123a = (k2.f123a ? 1 : 0) ^ i2;
                    }
                    z zVar = new z();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        zVar.f219f = 2;
                    } else if (source == 1025) {
                        zVar.f219f = 3;
                    } else if (source == 16777232) {
                        zVar.f219f = 4;
                    } else if (source != 33554433) {
                        zVar.f219f = 1;
                    } else {
                        zVar.f219f = 5;
                    }
                    zVar.f214a = keyEvent.getEventTime();
                    zVar.f215b = i3;
                    zVar.f217d = l5.longValue();
                    zVar.f216c = l3.longValue();
                    zVar.f220g = str;
                    zVar.f218e = false;
                    a(zVar, e2);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                J j3 = jArr2[i8];
                boolean z5 = (keyEvent.getMetaState() & j3.f121a) != 0;
                long longValue = l5.longValue();
                final long longValue2 = l3.longValue();
                I[] iArr2 = j3.f122b;
                boolean[] zArr2 = new boolean[2];
                Boolean[] boolArr = new Boolean[2];
                int i9 = 0;
                boolean z6 = false;
                for (int i10 = 2; i9 < i10; i10 = 2) {
                    final I i11 = iArr2[i9];
                    I[] iArr3 = iArr2;
                    boolean containsKey2 = hashMap3.containsKey(Long.valueOf(i11.f119a));
                    zArr2[i9] = containsKey2;
                    Boolean[] boolArr2 = boolArr;
                    if (i11.f120b == longValue) {
                        boolean z7 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 == 0) {
                            i7 = z7 ? 3 : 1;
                        } else {
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i7 = 2;
                        }
                        int a2 = AbstractC0068d.a(i7);
                        if (a2 == 0) {
                            zArr = zArr2;
                            hashMap2 = hashMap3;
                            i5 = length;
                            jArr = jArr2;
                            iArr = iArr3;
                            i6 = i8;
                            boolArr2[i9] = Boolean.FALSE;
                            if (!z5) {
                                final int i12 = 0;
                                arrayList.add(new Runnable(this) { // from class: E.B

                                    /* renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ C f104c;

                                    {
                                        this.f104c = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                C c2 = this.f104c;
                                                c2.getClass();
                                                c2.b(false, Long.valueOf(i11.f120b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                C c3 = this.f104c;
                                                c3.getClass();
                                                c3.b(false, Long.valueOf(i11.f120b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (a2 == 1) {
                            zArr = zArr2;
                            hashMap2 = hashMap3;
                            i5 = length;
                            jArr = jArr2;
                            iArr = iArr3;
                            i6 = i8;
                            boolArr2[i9] = Boolean.valueOf(zArr[i9]);
                        } else if (a2 != 2) {
                            zArr = zArr2;
                            hashMap2 = hashMap3;
                            i5 = length;
                            jArr = jArr2;
                            iArr = iArr3;
                            i6 = i8;
                        } else {
                            if (z5) {
                                zArr = zArr2;
                                hashMap2 = hashMap3;
                                i5 = length;
                                jArr = jArr2;
                                iArr = iArr3;
                                i6 = i8;
                            } else {
                                final int i13 = 1;
                                zArr = zArr2;
                                iArr = iArr3;
                                i6 = i8;
                                hashMap2 = hashMap3;
                                jArr = jArr2;
                                i5 = length;
                                arrayList.add(new Runnable(this) { // from class: E.B

                                    /* renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ C f104c;

                                    {
                                        this.f104c = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                C c2 = this.f104c;
                                                c2.getClass();
                                                c2.b(false, Long.valueOf(i11.f120b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                C c3 = this.f104c;
                                                c3.getClass();
                                                c3.b(false, Long.valueOf(i11.f120b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                            boolArr2[i9] = Boolean.valueOf(zArr[i9]);
                        }
                        z6 = true;
                    } else {
                        zArr = zArr2;
                        hashMap2 = hashMap3;
                        i5 = length;
                        jArr = jArr2;
                        iArr = iArr3;
                        i6 = i8;
                        z6 = z6 || containsKey2;
                    }
                    i9++;
                    iArr2 = iArr;
                    length = i5;
                    zArr2 = zArr;
                    i8 = i6;
                    boolArr = boolArr2;
                    jArr2 = jArr;
                    hashMap3 = hashMap2;
                }
                boolean[] zArr3 = zArr2;
                I[] iArr4 = iArr2;
                int i14 = i8;
                int i15 = length;
                Boolean[] boolArr3 = boolArr;
                J[] jArr3 = jArr2;
                if (z5) {
                    i4 = 2;
                    for (int i16 = 0; i16 < 2; i16++) {
                        if (boolArr3[i16] == null) {
                            if (z6) {
                                boolArr3[i16] = Boolean.valueOf(zArr3[i16]);
                            } else {
                                boolArr3[i16] = Boolean.TRUE;
                                z6 = true;
                            }
                        }
                    }
                    if (!z6) {
                        boolArr3[0] = Boolean.TRUE;
                    }
                } else {
                    i4 = 2;
                    for (int i17 = 0; i17 < 2; i17++) {
                        if (boolArr3[i17] == null) {
                            boolArr3[i17] = Boolean.FALSE;
                        }
                    }
                }
                for (int i18 = 0; i18 < i4; i18++) {
                    if (zArr3[i18] != boolArr3[i18].booleanValue()) {
                        I i19 = iArr4[i18];
                        b(boolArr3[i18].booleanValue(), Long.valueOf(i19.f120b), Long.valueOf(i19.f119a), keyEvent.getEventTime());
                    }
                }
                i8 = i14 + 1;
                length = i15;
                jArr2 = jArr3;
            }
        }
        b(true, Long.valueOf(j2), Long.valueOf(j2), 0L);
        e2.a(true);
    }

    public final void d(Long l2, Long l3) {
        HashMap hashMap = this.f109c;
        if (l3 != null) {
            if (((Long) hashMap.put(l2, l3)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l2)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
