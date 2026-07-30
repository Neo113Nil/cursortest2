package h4;

import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class u implements x {

    /* renamed from: d, reason: collision with root package name */
    public final s4.f f5273d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f5274e = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f5275i;

    /* renamed from: l, reason: collision with root package name */
    public final v f5276l;

    public u(s4.f fVar) {
        HashMap hashMap = new HashMap();
        this.f5275i = hashMap;
        this.f5276l = new v(0);
        this.f5273d = fVar;
        z zVar = AbstractC0482C.f5168a;
        C0481B c0481b = new C0481B();
        c0481b.f5167a = false;
        C0481B c0481b2 = new C0481B[]{c0481b}[0];
        c0481b2.getClass();
        hashMap.put(4294967556L, c0481b2);
    }

    public final void a(r rVar, final B6.e eVar) {
        long j;
        long j7;
        byte[] bArr = null;
        s4.e eVar2 = eVar == null ? null : new s4.e() { // from class: h4.s
            @Override // s4.e
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
                B6.e.this.c(bool.booleanValue());
            }
        };
        try {
            String str = rVar.f5266g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(rVar.f5260a);
            int i2 = rVar.f5261b;
            if (i2 == 1) {
                j = 0;
            } else if (i2 == 2) {
                j = 1;
            } else {
                if (i2 != 3) {
                    throw null;
                }
                j = 2;
            }
            allocateDirect.putLong(j);
            allocateDirect.putLong(rVar.f5262c);
            allocateDirect.putLong(rVar.f5263d);
            allocateDirect.putLong(rVar.f5264e ? 1L : 0L);
            int i5 = rVar.f5265f;
            if (i5 == 1) {
                j7 = 0;
            } else if (i5 == 2) {
                j7 = 1;
            } else if (i5 == 3) {
                j7 = 2;
            } else if (i5 == 4) {
                j7 = 3;
            } else {
                if (i5 != 5) {
                    throw null;
                }
                j7 = 4;
            }
            allocateDirect.putLong(j7);
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f5273d.f("flutter/keydata", allocateDirect, eVar2);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02e5  */
    @Override // h4.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(final KeyEvent keyEvent, B6.e eVar) {
        Long l7;
        boolean z7;
        Long l8;
        int i2;
        String str;
        int i5;
        int i7;
        C0481B c0481b;
        int i8;
        HashMap hashMap;
        int i9;
        HashMap hashMap2;
        Boolean[] boolArr;
        int i10;
        final long j;
        int i11;
        int i12;
        int i13;
        u uVar = this;
        if (keyEvent.getScanCode() != 0 || keyEvent.getKeyCode() != 0) {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                l7 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            } else {
                l7 = (Long) AbstractC0482C.f5168a.get(Long.valueOf(scanCode));
                if (l7 == null) {
                    l7 = Long.valueOf((keyEvent.getScanCode() & 4294967295L) | 73014444032L);
                }
            }
            Long l9 = l7;
            Long l10 = (Long) AbstractC0482C.f5169b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (l10 == null) {
                l10 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            }
            Long l11 = l10;
            ArrayList arrayList = new ArrayList();
            B6.p[] pVarArr = AbstractC0482C.f5170c;
            int length = pVarArr.length;
            int i14 = 0;
            while (true) {
                int i15 = 2;
                HashMap hashMap3 = uVar.f5274e;
                if (i14 >= length) {
                    HashMap hashMap4 = hashMap3;
                    Long l12 = l11;
                    HashMap hashMap5 = uVar.f5275i;
                    for (C0481B c0481b2 : hashMap5.values()) {
                        int metaState = keyEvent.getMetaState();
                        c0481b2.getClass();
                        boolean z8 = (metaState & 1048576) != 0;
                        if (4294967556L == l12.longValue() || c0481b2.f5167a == z8) {
                            hashMap = hashMap4;
                        } else {
                            hashMap = hashMap4;
                            boolean containsKey = hashMap.containsKey(458809L);
                            boolean z9 = !containsKey;
                            if (!containsKey) {
                                c0481b2.f5167a = !c0481b2.f5167a;
                            }
                            uVar.c(z9, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                c0481b2.f5167a = !c0481b2.f5167a;
                            }
                            c(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        uVar = this;
                        hashMap4 = hashMap;
                    }
                    HashMap hashMap6 = hashMap4;
                    int action = keyEvent.getAction();
                    if (action == 0) {
                        z7 = true;
                    } else if (action != 1) {
                        uVar = this;
                    } else {
                        z7 = false;
                    }
                    Long l13 = (Long) hashMap6.get(l9);
                    if (z7) {
                        if (l13 == null) {
                            i8 = 1;
                        } else if (keyEvent.getRepeatCount() > 0) {
                            i8 = 3;
                        } else {
                            uVar = this;
                            l8 = l9;
                            uVar.c(false, l13, l8, keyEvent.getEventTime());
                            i8 = 1;
                            char charValue = uVar.f5276l.a(keyEvent.getUnicodeChar()).charValue();
                            i2 = i8;
                            str = charValue == 0 ? "" + charValue : null;
                            i7 = 3;
                            i5 = 1;
                        }
                        uVar = this;
                        l8 = l9;
                        char charValue2 = uVar.f5276l.a(keyEvent.getUnicodeChar()).charValue();
                        if (charValue2 == 0) {
                        }
                        i2 = i8;
                        str = charValue2 == 0 ? "" + charValue2 : null;
                        i7 = 3;
                        i5 = 1;
                    } else {
                        uVar = this;
                        l8 = l9;
                        if (l13 != null) {
                            i2 = 2;
                            str = null;
                            i5 = 1;
                            i7 = 3;
                        }
                    }
                    if (i2 != i7) {
                        uVar.d(l8, z7 ? l12 : null);
                    }
                    if (i2 == i5 && (c0481b = (C0481B) hashMap5.get(l12)) != null) {
                        c0481b.f5167a = (c0481b.f5167a ? 1 : 0) ^ i5;
                    }
                    r rVar = new r();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        rVar.f5265f = 2;
                    } else if (source == 1025) {
                        rVar.f5265f = i7;
                    } else if (source == 16777232) {
                        rVar.f5265f = 4;
                    } else if (source != 33554433) {
                        rVar.f5265f = 1;
                    } else {
                        rVar.f5265f = 5;
                    }
                    rVar.f5260a = keyEvent.getEventTime();
                    rVar.f5261b = i2;
                    rVar.f5263d = l12.longValue();
                    rVar.f5262c = l8.longValue();
                    rVar.f5266g = str;
                    rVar.f5264e = false;
                    uVar.a(rVar, eVar);
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj = arrayList.get(i16);
                        i16++;
                        ((Runnable) obj).run();
                    }
                    return;
                }
                B6.p pVar = pVarArr[i14];
                boolean z10 = (pVar.f233b & keyEvent.getMetaState()) != 0;
                long longValue = l11.longValue();
                long longValue2 = l9.longValue();
                C0480A[] c0480aArr = (C0480A[]) pVar.f234c;
                boolean[] zArr = new boolean[2];
                Boolean[] boolArr2 = new Boolean[2];
                int i17 = 0;
                boolean z11 = false;
                while (i17 < i15) {
                    final C0480A c0480a = c0480aArr[i17];
                    boolean[] zArr2 = zArr;
                    boolean containsKey2 = hashMap3.containsKey(Long.valueOf(c0480a.f5165a));
                    zArr2[i17] = containsKey2;
                    Long l14 = l11;
                    if (c0480a.f5166b == longValue) {
                        boolean z12 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 != 0) {
                            i12 = 1;
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i13 = 2;
                        } else {
                            i12 = 1;
                            i13 = z12 ? 3 : 1;
                        }
                        int b7 = S.i.b(i13);
                        if (b7 == 0) {
                            hashMap2 = hashMap3;
                            boolArr = boolArr2;
                            i10 = i17;
                            j = longValue2;
                            i11 = 2;
                            i9 = i14;
                            boolArr[i10] = Boolean.FALSE;
                            if (!z10) {
                                final int i18 = 0;
                                arrayList.add(new Runnable(this) { // from class: h4.t

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ u f5269e;

                                    {
                                        this.f5269e = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i18) {
                                            case 0:
                                                u uVar2 = this.f5269e;
                                                uVar2.getClass();
                                                uVar2.c(false, Long.valueOf(c0480a.f5166b), Long.valueOf(j), keyEvent.getEventTime());
                                                break;
                                            default:
                                                u uVar3 = this.f5269e;
                                                uVar3.getClass();
                                                uVar3.c(false, Long.valueOf(c0480a.f5166b), Long.valueOf(j), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (b7 == i12) {
                            i9 = i14;
                            hashMap2 = hashMap3;
                            boolArr = boolArr2;
                            i10 = i17;
                            j = longValue2;
                            i11 = 2;
                            boolArr[i10] = Boolean.valueOf(zArr2[i10]);
                        } else if (b7 != 2) {
                            i9 = i14;
                            i11 = 2;
                            hashMap2 = hashMap3;
                            boolArr = boolArr2;
                            i10 = i17;
                            j = longValue2;
                        } else {
                            if (z10) {
                                i9 = i14;
                                i11 = 2;
                                hashMap2 = hashMap3;
                                boolArr = boolArr2;
                                i10 = i17;
                                j = longValue2;
                            } else {
                                int i19 = i17;
                                final int i20 = 1;
                                i10 = i19;
                                i11 = 2;
                                hashMap2 = hashMap3;
                                boolArr = boolArr2;
                                j = longValue2;
                                i9 = i14;
                                arrayList.add(new Runnable(this) { // from class: h4.t

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ u f5269e;

                                    {
                                        this.f5269e = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i20) {
                                            case 0:
                                                u uVar2 = this.f5269e;
                                                uVar2.getClass();
                                                uVar2.c(false, Long.valueOf(c0480a.f5166b), Long.valueOf(j), keyEvent.getEventTime());
                                                break;
                                            default:
                                                u uVar3 = this.f5269e;
                                                uVar3.getClass();
                                                uVar3.c(false, Long.valueOf(c0480a.f5166b), Long.valueOf(j), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                            boolArr[i10] = Boolean.valueOf(zArr2[i10]);
                        }
                        z11 = true;
                    } else {
                        i9 = i14;
                        hashMap2 = hashMap3;
                        boolArr = boolArr2;
                        i10 = i17;
                        j = longValue2;
                        i11 = 2;
                        z11 = z11 || containsKey2;
                    }
                    i17 = i10 + 1;
                    longValue2 = j;
                    i15 = i11;
                    boolArr2 = boolArr;
                    i14 = i9;
                    zArr = zArr2;
                    l11 = l14;
                    hashMap3 = hashMap2;
                }
                int i21 = i14;
                int i22 = i15;
                boolean[] zArr3 = zArr;
                Long l15 = l11;
                Boolean[] boolArr3 = boolArr2;
                boolean z13 = keyEvent.getDeviceId() == -1;
                if (z10) {
                    for (int i23 = 0; i23 < i22; i23++) {
                        if (boolArr3[i23] == null) {
                            if (z11 || z13) {
                                boolArr3[i23] = Boolean.valueOf(zArr3[i23]);
                            } else {
                                boolArr3[i23] = Boolean.TRUE;
                                z11 = true;
                            }
                        }
                    }
                    if (!z11 && !z13) {
                        boolArr3[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i24 = 0; i24 < i22; i24++) {
                        if (boolArr3[i24] == null) {
                            boolArr3[i24] = Boolean.FALSE;
                        }
                    }
                }
                for (int i25 = 0; i25 < i22; i25++) {
                    if (zArr3[i25] != boolArr3[i25].booleanValue()) {
                        C0480A c0480a2 = c0480aArr[i25];
                        c(boolArr3[i25].booleanValue(), Long.valueOf(c0480a2.f5166b), Long.valueOf(c0480a2.f5165a), keyEvent.getEventTime());
                    }
                }
                uVar = this;
                i14 = i21 + 1;
                l11 = l15;
            }
        }
        uVar.c(true, 0L, 0L, 0L);
        eVar.c(true);
    }

    public final void c(boolean z7, Long l7, Long l8, long j) {
        r rVar = new r();
        rVar.f5260a = j;
        rVar.f5261b = z7 ? 1 : 2;
        rVar.f5263d = l7.longValue();
        rVar.f5262c = l8.longValue();
        rVar.f5266g = null;
        rVar.f5264e = true;
        rVar.f5265f = 1;
        if (l8.longValue() != 0 && l7.longValue() != 0) {
            if (!z7) {
                l7 = null;
            }
            d(l8, l7);
        }
        a(rVar, null);
    }

    public final void d(Long l7, Long l8) {
        HashMap hashMap = this.f5274e;
        if (l8 != null) {
            if (((Long) hashMap.put(l7, l8)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l7)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
