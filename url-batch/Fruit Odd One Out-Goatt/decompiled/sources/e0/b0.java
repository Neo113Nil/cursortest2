package e0;

import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class b0 implements f0 {

    /* renamed from: b, reason: collision with root package name */
    public final n0.e f129b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f130c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f131d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f132e;

    public b0(n0.e eVar) {
        HashMap hashMap = new HashMap();
        this.f131d = hashMap;
        this.f132e = new c0();
        this.f129b = eVar;
        i0 i0Var = m0.f184a;
        l0 l0Var = new l0();
        l0Var.f178a = false;
        l0 l0Var2 = new l0[]{l0Var}[0];
        l0Var2.getClass();
        hashMap.put(4294967556L, l0Var2);
    }

    public final void a(y yVar, final d0 d0Var) {
        long j2;
        long j3;
        byte[] bArr = null;
        n0.d dVar = d0Var == null ? null : new n0.d() { // from class: e0.z
            @Override // n0.d
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
                d0.this.a(bool.booleanValue());
            }
        };
        try {
            String str = yVar.f241g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(yVar.f235a);
            int i2 = yVar.f236b;
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
            allocateDirect.putLong(yVar.f237c);
            allocateDirect.putLong(yVar.f238d);
            allocateDirect.putLong(yVar.f239e ? 1L : 0L);
            int i3 = yVar.f240f;
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
            this.f129b.k("flutter/keydata", allocateDirect, dVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void b(boolean z2, Long l2, Long l3, long j2) {
        y yVar = new y();
        yVar.f235a = j2;
        yVar.f236b = z2 ? 1 : 2;
        yVar.f238d = l2.longValue();
        yVar.f237c = l3.longValue();
        yVar.f241g = null;
        yVar.f239e = true;
        yVar.f240f = 1;
        if (l3.longValue() != 0 && l2.longValue() != 0) {
            if (!z2) {
                l2 = null;
            }
            c(l3, l2);
        }
        a(yVar, null);
    }

    public final void c(Long l2, Long l3) {
        HashMap hashMap = this.f130c;
        if (l3 != null) {
            if (((Long) hashMap.put(l2, l3)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l2)) == null) {
            throw new AssertionError("The key was empty");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0304  */
    @Override // e0.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(final KeyEvent keyEvent, d0 d0Var) {
        Long l2;
        boolean z2;
        Long l3;
        String str;
        int i2;
        l0 l0Var;
        int i3;
        Boolean[] boolArr;
        int i4;
        int i5;
        HashMap hashMap;
        j0[] j0VarArr;
        boolean[] zArr;
        final long j2;
        int i6;
        int i7;
        b0 b0Var = this;
        if (keyEvent.getScanCode() != 0 || keyEvent.getKeyCode() != 0) {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                l2 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            } else {
                l2 = (Long) m0.f184a.get(Long.valueOf(scanCode));
                if (l2 == null) {
                    l2 = Long.valueOf((keyEvent.getScanCode() & 4294967295L) | 73014444032L);
                }
            }
            Long l4 = l2;
            Long l5 = (Long) m0.f185b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (l5 == null) {
                l5 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            }
            Long l6 = l5;
            ArrayList arrayList = new ArrayList();
            k0[] k0VarArr = m0.f186c;
            int length = k0VarArr.length;
            int i8 = 0;
            while (true) {
                int i9 = 2;
                HashMap hashMap2 = b0Var.f130c;
                if (i8 >= length) {
                    Long l7 = l6;
                    HashMap hashMap3 = b0Var.f131d;
                    for (l0 l0Var2 : hashMap3.values()) {
                        int metaState = keyEvent.getMetaState();
                        l0Var2.getClass();
                        boolean z3 = (metaState & 1048576) != 0;
                        if (4294967556L != l7.longValue() && l0Var2.f178a != z3) {
                            boolean containsKey = hashMap2.containsKey(458809L);
                            boolean z4 = !containsKey;
                            if (!containsKey) {
                                l0Var2.f178a = !l0Var2.f178a;
                            }
                            b0Var.b(z4, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                l0Var2.f178a = !l0Var2.f178a;
                            }
                            b(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        b0Var = this;
                    }
                    int action = keyEvent.getAction();
                    if (action == 0) {
                        z2 = true;
                    } else if (action != 1) {
                        b0Var = this;
                    } else {
                        z2 = false;
                    }
                    Long l8 = (Long) hashMap2.get(l4);
                    if (z2) {
                        if (l8 == null) {
                            i3 = 1;
                            b0Var = this;
                        } else if (keyEvent.getRepeatCount() > 0) {
                            b0Var = this;
                            i3 = 3;
                        } else {
                            b0Var = this;
                            l3 = l4;
                            b0Var.b(false, l8, l3, keyEvent.getEventTime());
                            i3 = 1;
                            char charValue = b0Var.f132e.a(keyEvent.getUnicodeChar()).charValue();
                            i2 = i3;
                            str = charValue == 0 ? "" + charValue : null;
                        }
                        l3 = l4;
                        char charValue2 = b0Var.f132e.a(keyEvent.getUnicodeChar()).charValue();
                        if (charValue2 == 0) {
                        }
                        i2 = i3;
                        str = charValue2 == 0 ? "" + charValue2 : null;
                    } else {
                        b0Var = this;
                        l3 = l4;
                        if (l8 != null) {
                            str = null;
                            i2 = 2;
                        }
                    }
                    if (i2 != 3) {
                        b0Var.c(l3, z2 ? l7 : null);
                    }
                    if (i2 == 1 && (l0Var = (l0) hashMap3.get(l7)) != null) {
                        l0Var.f178a = !l0Var.f178a;
                    }
                    y yVar = new y();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        yVar.f240f = 2;
                    } else if (source == 1025) {
                        yVar.f240f = 3;
                    } else if (source == 16777232) {
                        yVar.f240f = 4;
                    } else if (source != 33554433) {
                        yVar.f240f = 1;
                    } else {
                        yVar.f240f = 5;
                    }
                    yVar.f235a = keyEvent.getEventTime();
                    yVar.f236b = i2;
                    yVar.f238d = l7.longValue();
                    yVar.f237c = l3.longValue();
                    yVar.f241g = str;
                    yVar.f239e = false;
                    b0Var.a(yVar, d0Var);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((Runnable) obj).run();
                    }
                    return;
                }
                k0 k0Var = k0VarArr[i8];
                boolean z5 = (k0Var.f175a & keyEvent.getMetaState()) != 0;
                long longValue = l6.longValue();
                long longValue2 = l4.longValue();
                j0[] j0VarArr2 = k0Var.f176b;
                boolean[] zArr2 = new boolean[2];
                Boolean[] boolArr2 = new Boolean[2];
                int i11 = 0;
                boolean z6 = false;
                while (i11 < i9) {
                    final j0 j0Var = j0VarArr2[i11];
                    Long l9 = l6;
                    boolean containsKey2 = hashMap2.containsKey(Long.valueOf(j0Var.f166a));
                    zArr2[i11] = containsKey2;
                    int i12 = i8;
                    if (j0Var.f167b == longValue) {
                        boolean z7 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 != 0) {
                            i6 = 1;
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i7 = 2;
                        } else {
                            i6 = 1;
                            i7 = z7 ? 3 : 1;
                        }
                        int a2 = o.d.a(i7);
                        if (a2 == 0) {
                            hashMap = hashMap2;
                            boolArr = boolArr2;
                            i4 = i12;
                            i5 = 2;
                            long j3 = longValue2;
                            j0VarArr = j0VarArr2;
                            zArr = zArr2;
                            j2 = j3;
                            boolArr[i11] = Boolean.FALSE;
                            if (!z5) {
                                final int i13 = 0;
                                arrayList.add(new Runnable(this) { // from class: e0.a0

                                    /* renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ b0 f119c;

                                    {
                                        this.f119c = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                this.f119c.b(false, Long.valueOf(j0Var.f167b), Long.valueOf(j2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                this.f119c.b(false, Long.valueOf(j0Var.f167b), Long.valueOf(j2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (a2 == i6) {
                            hashMap = hashMap2;
                            boolArr = boolArr2;
                            i4 = i12;
                            i5 = 2;
                            long j4 = longValue2;
                            j0VarArr = j0VarArr2;
                            zArr = zArr2;
                            j2 = j4;
                            boolArr[i11] = Boolean.valueOf(zArr[i11]);
                        } else if (a2 != 2) {
                            hashMap = hashMap2;
                            boolArr = boolArr2;
                            i4 = i12;
                            i5 = 2;
                            long j5 = longValue2;
                            j0VarArr = j0VarArr2;
                            zArr = zArr2;
                            j2 = j5;
                        } else {
                            if (z5) {
                                hashMap = hashMap2;
                                boolArr = boolArr2;
                                i4 = i12;
                                i5 = 2;
                                long j6 = longValue2;
                                j0VarArr = j0VarArr2;
                                zArr = zArr2;
                                j2 = j6;
                            } else {
                                Boolean[] boolArr3 = boolArr2;
                                final int i14 = 1;
                                boolArr = boolArr3;
                                i4 = i12;
                                i5 = 2;
                                hashMap = hashMap2;
                                long j7 = longValue2;
                                j0VarArr = j0VarArr2;
                                zArr = zArr2;
                                j2 = j7;
                                arrayList.add(new Runnable(this) { // from class: e0.a0

                                    /* renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ b0 f119c;

                                    {
                                        this.f119c = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                this.f119c.b(false, Long.valueOf(j0Var.f167b), Long.valueOf(j2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                this.f119c.b(false, Long.valueOf(j0Var.f167b), Long.valueOf(j2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                            boolArr[i11] = Boolean.valueOf(zArr[i11]);
                        }
                        z6 = true;
                    } else {
                        boolArr = boolArr2;
                        i4 = i12;
                        i5 = 2;
                        hashMap = hashMap2;
                        long j8 = longValue2;
                        j0VarArr = j0VarArr2;
                        zArr = zArr2;
                        j2 = j8;
                        z6 = z6 || containsKey2;
                    }
                    i11++;
                    i9 = i5;
                    i8 = i4;
                    zArr2 = zArr;
                    boolArr2 = boolArr;
                    l6 = l9;
                    long j9 = j2;
                    hashMap2 = hashMap;
                    j0VarArr2 = j0VarArr;
                    longValue2 = j9;
                }
                int i15 = i8;
                j0[] j0VarArr3 = j0VarArr2;
                boolean[] zArr3 = zArr2;
                Boolean[] boolArr4 = boolArr2;
                Long l10 = l6;
                int i16 = i9;
                boolean z8 = keyEvent.getDeviceId() == -1;
                if (z5) {
                    for (int i17 = 0; i17 < i16; i17++) {
                        if (boolArr4[i17] == null) {
                            if (z6 || z8) {
                                boolArr4[i17] = Boolean.valueOf(zArr3[i17]);
                            } else {
                                boolArr4[i17] = Boolean.TRUE;
                                z6 = true;
                            }
                        }
                    }
                    if (!z6 && !z8) {
                        boolArr4[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i18 = 0; i18 < i16; i18++) {
                        if (boolArr4[i18] == null) {
                            boolArr4[i18] = Boolean.FALSE;
                        }
                    }
                }
                for (int i19 = 0; i19 < i16; i19++) {
                    if (zArr3[i19] != boolArr4[i19].booleanValue()) {
                        j0 j0Var2 = j0VarArr3[i19];
                        b(boolArr4[i19].booleanValue(), Long.valueOf(j0Var2.f167b), Long.valueOf(j0Var2.f166a), keyEvent.getEventTime());
                    }
                }
                b0Var = this;
                i8 = i15 + 1;
                l6 = l10;
            }
        }
        b0Var.b(true, 0L, 0L, 0L);
        d0Var.a(true);
    }
}
