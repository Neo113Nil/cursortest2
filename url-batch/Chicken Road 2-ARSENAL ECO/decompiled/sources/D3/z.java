package D3;

import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class z implements D {

    /* renamed from: f, reason: collision with root package name */
    public final O3.e f504f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f505g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f506h;

    /* renamed from: i, reason: collision with root package name */
    public final A f507i;

    public z(O3.e eVar) {
        HashMap hashMap = new HashMap();
        this.f506h = hashMap;
        this.f507i = new A(0, false);
        this.f504f = eVar;
        F f7 = I.f394a;
        H h7 = new H();
        h7.f393a = false;
        H h8 = new H[]{h7}[0];
        h8.getClass();
        hashMap.put(4294967556L, h8);
    }

    public final void a(w wVar, final B b7) {
        long j4;
        long j7;
        byte[] bArr = null;
        O3.d dVar = b7 == null ? null : new O3.d() { // from class: D3.x
            @Override // O3.d
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
                B.this.b(bool.booleanValue());
            }
        };
        try {
            String str = wVar.f497g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(wVar.f491a);
            int i7 = wVar.f492b;
            if (i7 == 1) {
                j4 = 0;
            } else if (i7 == 2) {
                j4 = 1;
            } else {
                if (i7 != 3) {
                    throw null;
                }
                j4 = 2;
            }
            allocateDirect.putLong(j4);
            allocateDirect.putLong(wVar.f493c);
            allocateDirect.putLong(wVar.f494d);
            allocateDirect.putLong(wVar.f495e ? 1L : 0L);
            int i8 = wVar.f496f;
            if (i8 == 1) {
                j7 = 0;
            } else if (i8 == 2) {
                j7 = 1;
            } else if (i8 == 3) {
                j7 = 2;
            } else if (i8 == 4) {
                j7 = 3;
            } else {
                if (i8 != 5) {
                    throw null;
                }
                j7 = 4;
            }
            allocateDirect.putLong(j7);
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f504f.k("flutter/keydata", allocateDirect, dVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02e5  */
    @Override // D3.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(final KeyEvent keyEvent, B b7) {
        Long l7;
        boolean z5;
        Long l8;
        int i7;
        String str;
        int i8;
        int i9;
        H h7;
        int i10;
        HashMap hashMap;
        int i11;
        HashMap hashMap2;
        Boolean[] boolArr;
        int i12;
        final long j4;
        int i13;
        int i14;
        int i15;
        z zVar = this;
        if (keyEvent.getScanCode() != 0 || keyEvent.getKeyCode() != 0) {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                l7 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            } else {
                l7 = (Long) I.f394a.get(Long.valueOf(scanCode));
                if (l7 == null) {
                    l7 = Long.valueOf((keyEvent.getScanCode() & 4294967295L) | 73014444032L);
                }
            }
            Long l9 = l7;
            Long l10 = (Long) I.f395b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (l10 == null) {
                l10 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            }
            Long l11 = l10;
            ArrayList arrayList = new ArrayList();
            A.j[] jVarArr = I.f396c;
            int length = jVarArr.length;
            int i16 = 0;
            while (true) {
                int i17 = 2;
                HashMap hashMap3 = zVar.f505g;
                if (i16 >= length) {
                    HashMap hashMap4 = hashMap3;
                    Long l12 = l11;
                    HashMap hashMap5 = zVar.f506h;
                    for (H h8 : hashMap5.values()) {
                        int metaState = keyEvent.getMetaState();
                        h8.getClass();
                        boolean z6 = (metaState & 1048576) != 0;
                        if (4294967556L == l12.longValue() || h8.f393a == z6) {
                            hashMap = hashMap4;
                        } else {
                            hashMap = hashMap4;
                            boolean containsKey = hashMap.containsKey(458809L);
                            boolean z7 = !containsKey;
                            if (!containsKey) {
                                h8.f393a = !h8.f393a;
                            }
                            zVar.c(z7, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                h8.f393a = !h8.f393a;
                            }
                            c(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        zVar = this;
                        hashMap4 = hashMap;
                    }
                    HashMap hashMap6 = hashMap4;
                    int action = keyEvent.getAction();
                    if (action == 0) {
                        z5 = true;
                    } else if (action != 1) {
                        zVar = this;
                    } else {
                        z5 = false;
                    }
                    Long l13 = (Long) hashMap6.get(l9);
                    if (z5) {
                        if (l13 == null) {
                            i10 = 1;
                        } else if (keyEvent.getRepeatCount() > 0) {
                            i10 = 3;
                        } else {
                            zVar = this;
                            l8 = l9;
                            zVar.c(false, l13, l8, keyEvent.getEventTime());
                            i10 = 1;
                            char charValue = zVar.f507i.a(keyEvent.getUnicodeChar()).charValue();
                            i7 = i10;
                            str = charValue == 0 ? "" + charValue : null;
                            i9 = 3;
                            i8 = 1;
                        }
                        zVar = this;
                        l8 = l9;
                        char charValue2 = zVar.f507i.a(keyEvent.getUnicodeChar()).charValue();
                        if (charValue2 == 0) {
                        }
                        i7 = i10;
                        str = charValue2 == 0 ? "" + charValue2 : null;
                        i9 = 3;
                        i8 = 1;
                    } else {
                        zVar = this;
                        l8 = l9;
                        if (l13 != null) {
                            i7 = 2;
                            str = null;
                            i8 = 1;
                            i9 = 3;
                        }
                    }
                    if (i7 != i9) {
                        zVar.d(l8, z5 ? l12 : null);
                    }
                    if (i7 == i8 && (h7 = (H) hashMap5.get(l12)) != null) {
                        h7.f393a = (h7.f393a ? 1 : 0) ^ i8;
                    }
                    w wVar = new w();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        wVar.f496f = 2;
                    } else if (source == 1025) {
                        wVar.f496f = i9;
                    } else if (source == 16777232) {
                        wVar.f496f = 4;
                    } else if (source != 33554433) {
                        wVar.f496f = 1;
                    } else {
                        wVar.f496f = 5;
                    }
                    wVar.f491a = keyEvent.getEventTime();
                    wVar.f492b = i7;
                    wVar.f494d = l12.longValue();
                    wVar.f493c = l8.longValue();
                    wVar.f497g = str;
                    wVar.f495e = false;
                    zVar.a(wVar, b7);
                    int size = arrayList.size();
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj = arrayList.get(i18);
                        i18++;
                        ((Runnable) obj).run();
                    }
                    return;
                }
                A.j jVar = jVarArr[i16];
                boolean z8 = (jVar.f26b & keyEvent.getMetaState()) != 0;
                long longValue = l11.longValue();
                long longValue2 = l9.longValue();
                G[] gArr = (G[]) jVar.f27c;
                boolean[] zArr = new boolean[2];
                Boolean[] boolArr2 = new Boolean[2];
                int i19 = 0;
                boolean z9 = false;
                while (i19 < i17) {
                    final G g7 = gArr[i19];
                    boolean[] zArr2 = zArr;
                    boolean containsKey2 = hashMap3.containsKey(Long.valueOf(g7.f391a));
                    zArr2[i19] = containsKey2;
                    Long l14 = l11;
                    if (g7.f392b == longValue) {
                        boolean z10 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 != 0) {
                            i14 = 1;
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i15 = 2;
                        } else {
                            i14 = 1;
                            i15 = z10 ? 3 : 1;
                        }
                        int c7 = N.p.c(i15);
                        if (c7 == 0) {
                            hashMap2 = hashMap3;
                            boolArr = boolArr2;
                            i12 = i19;
                            j4 = longValue2;
                            i13 = 2;
                            i11 = i16;
                            boolArr[i12] = Boolean.FALSE;
                            if (!z8) {
                                final int i20 = 0;
                                arrayList.add(new Runnable(this) { // from class: D3.y

                                    /* renamed from: g, reason: collision with root package name */
                                    public final /* synthetic */ z f500g;

                                    {
                                        this.f500g = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i20) {
                                            case 0:
                                                z zVar2 = this.f500g;
                                                zVar2.getClass();
                                                zVar2.c(false, Long.valueOf(g7.f392b), Long.valueOf(j4), keyEvent.getEventTime());
                                                break;
                                            default:
                                                z zVar3 = this.f500g;
                                                zVar3.getClass();
                                                zVar3.c(false, Long.valueOf(g7.f392b), Long.valueOf(j4), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (c7 == i14) {
                            i11 = i16;
                            hashMap2 = hashMap3;
                            boolArr = boolArr2;
                            i12 = i19;
                            j4 = longValue2;
                            i13 = 2;
                            boolArr[i12] = Boolean.valueOf(zArr2[i12]);
                        } else if (c7 != 2) {
                            i11 = i16;
                            i13 = 2;
                            hashMap2 = hashMap3;
                            boolArr = boolArr2;
                            i12 = i19;
                            j4 = longValue2;
                        } else {
                            if (z8) {
                                i11 = i16;
                                i13 = 2;
                                hashMap2 = hashMap3;
                                boolArr = boolArr2;
                                i12 = i19;
                                j4 = longValue2;
                            } else {
                                int i21 = i19;
                                final int i22 = 1;
                                i12 = i21;
                                i13 = 2;
                                hashMap2 = hashMap3;
                                boolArr = boolArr2;
                                j4 = longValue2;
                                i11 = i16;
                                arrayList.add(new Runnable(this) { // from class: D3.y

                                    /* renamed from: g, reason: collision with root package name */
                                    public final /* synthetic */ z f500g;

                                    {
                                        this.f500g = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i22) {
                                            case 0:
                                                z zVar2 = this.f500g;
                                                zVar2.getClass();
                                                zVar2.c(false, Long.valueOf(g7.f392b), Long.valueOf(j4), keyEvent.getEventTime());
                                                break;
                                            default:
                                                z zVar3 = this.f500g;
                                                zVar3.getClass();
                                                zVar3.c(false, Long.valueOf(g7.f392b), Long.valueOf(j4), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                            boolArr[i12] = Boolean.valueOf(zArr2[i12]);
                        }
                        z9 = true;
                    } else {
                        i11 = i16;
                        hashMap2 = hashMap3;
                        boolArr = boolArr2;
                        i12 = i19;
                        j4 = longValue2;
                        i13 = 2;
                        z9 = z9 || containsKey2;
                    }
                    i19 = i12 + 1;
                    longValue2 = j4;
                    i17 = i13;
                    boolArr2 = boolArr;
                    i16 = i11;
                    zArr = zArr2;
                    l11 = l14;
                    hashMap3 = hashMap2;
                }
                int i23 = i16;
                int i24 = i17;
                boolean[] zArr3 = zArr;
                Long l15 = l11;
                Boolean[] boolArr3 = boolArr2;
                boolean z11 = keyEvent.getDeviceId() == -1;
                if (z8) {
                    for (int i25 = 0; i25 < i24; i25++) {
                        if (boolArr3[i25] == null) {
                            if (z9 || z11) {
                                boolArr3[i25] = Boolean.valueOf(zArr3[i25]);
                            } else {
                                boolArr3[i25] = Boolean.TRUE;
                                z9 = true;
                            }
                        }
                    }
                    if (!z9 && !z11) {
                        boolArr3[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i26 = 0; i26 < i24; i26++) {
                        if (boolArr3[i26] == null) {
                            boolArr3[i26] = Boolean.FALSE;
                        }
                    }
                }
                for (int i27 = 0; i27 < i24; i27++) {
                    if (zArr3[i27] != boolArr3[i27].booleanValue()) {
                        G g8 = gArr[i27];
                        c(boolArr3[i27].booleanValue(), Long.valueOf(g8.f392b), Long.valueOf(g8.f391a), keyEvent.getEventTime());
                    }
                }
                zVar = this;
                i16 = i23 + 1;
                l11 = l15;
            }
        }
        zVar.c(true, 0L, 0L, 0L);
        b7.b(true);
    }

    public final void c(boolean z5, Long l7, Long l8, long j4) {
        w wVar = new w();
        wVar.f491a = j4;
        wVar.f492b = z5 ? 1 : 2;
        wVar.f494d = l7.longValue();
        wVar.f493c = l8.longValue();
        wVar.f497g = null;
        wVar.f495e = true;
        wVar.f496f = 1;
        if (l8.longValue() != 0 && l7.longValue() != 0) {
            if (!z5) {
                l7 = null;
            }
            d(l8, l7);
        }
        a(wVar, null);
    }

    public final void d(Long l7, Long l8) {
        HashMap hashMap = this.f505g;
        if (l8 != null) {
            if (((Long) hashMap.put(l7, l8)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l7)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
