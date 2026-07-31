package k0;

import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import v0.InterfaceC0240e;
import v0.InterfaceC0241f;

/* loaded from: classes.dex */
public final class v implements y {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0241f f2754e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f2755f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f2756g;

    /* renamed from: h, reason: collision with root package name */
    public final d1.i f2757h;

    public v(InterfaceC0241f interfaceC0241f) {
        HashMap hashMap = new HashMap();
        this.f2756g = hashMap;
        this.f2757h = new d1.i();
        this.f2754e = interfaceC0241f;
        C0183A c0183a = E.f2650a;
        D d2 = new D();
        d2.f2649a = false;
        D d3 = new D[]{d2}[0];
        d3.getClass();
        hashMap.put(4294967556L, d3);
    }

    public final void a(s sVar, final w wVar) {
        long j2;
        long j3;
        byte[] bArr = null;
        InterfaceC0240e interfaceC0240e = wVar == null ? null : new InterfaceC0240e() { // from class: k0.t
            @Override // v0.InterfaceC0240e
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
                w.this.a(bool.booleanValue());
            }
        };
        try {
            String str = sVar.f2747g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(sVar.f2741a);
            int i2 = sVar.f2742b;
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
            allocateDirect.putLong(sVar.f2743c);
            allocateDirect.putLong(sVar.f2744d);
            allocateDirect.putLong(sVar.f2745e ? 1L : 0L);
            int i3 = sVar.f2746f;
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
            this.f2754e.e("flutter/keydata", allocateDirect, interfaceC0240e);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void b(boolean z2, Long l2, Long l3, long j2) {
        s sVar = new s();
        sVar.f2741a = j2;
        sVar.f2742b = z2 ? 1 : 2;
        sVar.f2744d = l2.longValue();
        sVar.f2743c = l3.longValue();
        sVar.f2747g = null;
        sVar.f2745e = true;
        sVar.f2746f = 1;
        if (l3.longValue() != 0 && l2.longValue() != 0) {
            if (!z2) {
                l2 = null;
            }
            c(l3, l2);
        }
        a(sVar, null);
    }

    public final void c(Long l2, Long l3) {
        HashMap hashMap = this.f2755f;
        if (l3 != null) {
            if (((Long) hashMap.put(l2, l3)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l2)) == null) {
            throw new AssertionError("The key was empty");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02d5  */
    @Override // k0.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(final KeyEvent keyEvent, w wVar) {
        Long l2;
        boolean z2;
        Long l3;
        int i2;
        String str;
        int i3;
        int i4;
        D d2;
        int i5;
        HashMap hashMap;
        int i6;
        HashMap hashMap2;
        Boolean[] boolArr;
        int i7;
        final long j2;
        int i8;
        int i9;
        int i10;
        v vVar = this;
        if (keyEvent.getScanCode() != 0 || keyEvent.getKeyCode() != 0) {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                l2 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            } else {
                l2 = (Long) E.f2650a.get(Long.valueOf(scanCode));
                if (l2 == null) {
                    l2 = Long.valueOf((keyEvent.getScanCode() & 4294967295L) | 73014444032L);
                }
            }
            Long l4 = l2;
            Long l5 = (Long) E.f2651b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (l5 == null) {
                l5 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            }
            Long l6 = l5;
            ArrayList arrayList = new ArrayList();
            C[] cArr = E.f2652c;
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                int i12 = 2;
                HashMap hashMap3 = vVar.f2755f;
                if (i11 >= length) {
                    HashMap hashMap4 = hashMap3;
                    Long l7 = l6;
                    HashMap hashMap5 = vVar.f2756g;
                    for (D d3 : hashMap5.values()) {
                        int metaState = keyEvent.getMetaState();
                        d3.getClass();
                        boolean z3 = (metaState & 1048576) != 0;
                        if (4294967556L == l7.longValue() || d3.f2649a == z3) {
                            hashMap = hashMap4;
                        } else {
                            hashMap = hashMap4;
                            boolean containsKey = hashMap.containsKey(458809L);
                            boolean z4 = !containsKey;
                            if (!containsKey) {
                                d3.f2649a = !d3.f2649a;
                            }
                            vVar.b(z4, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                d3.f2649a = !d3.f2649a;
                            }
                            b(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        vVar = this;
                        hashMap4 = hashMap;
                    }
                    HashMap hashMap6 = hashMap4;
                    int action = keyEvent.getAction();
                    if (action == 0) {
                        z2 = true;
                    } else if (action != 1) {
                        vVar = this;
                    } else {
                        z2 = false;
                    }
                    Long l8 = (Long) hashMap6.get(l4);
                    if (z2) {
                        if (l8 == null) {
                            i5 = 1;
                        } else if (keyEvent.getRepeatCount() > 0) {
                            i5 = 3;
                        } else {
                            vVar = this;
                            l3 = l4;
                            vVar.b(false, l8, l3, keyEvent.getEventTime());
                            i5 = 1;
                            char charValue = vVar.f2757h.a(keyEvent.getUnicodeChar()).charValue();
                            i2 = i5;
                            str = charValue == 0 ? "" + charValue : null;
                            i4 = 3;
                            i3 = 1;
                        }
                        vVar = this;
                        l3 = l4;
                        char charValue2 = vVar.f2757h.a(keyEvent.getUnicodeChar()).charValue();
                        if (charValue2 == 0) {
                        }
                        i2 = i5;
                        str = charValue2 == 0 ? "" + charValue2 : null;
                        i4 = 3;
                        i3 = 1;
                    } else {
                        vVar = this;
                        l3 = l4;
                        if (l8 != null) {
                            i2 = 2;
                            str = null;
                            i3 = 1;
                            i4 = 3;
                        }
                    }
                    if (i2 != i4) {
                        vVar.c(l3, z2 ? l7 : null);
                    }
                    if (i2 == i3 && (d2 = (D) hashMap5.get(l7)) != null) {
                        d2.f2649a = (d2.f2649a ? 1 : 0) ^ i3;
                    }
                    s sVar = new s();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        sVar.f2746f = 2;
                    } else if (source == 1025) {
                        sVar.f2746f = i4;
                    } else if (source == 16777232) {
                        sVar.f2746f = 4;
                    } else if (source != 33554433) {
                        sVar.f2746f = 1;
                    } else {
                        sVar.f2746f = 5;
                    }
                    sVar.f2741a = keyEvent.getEventTime();
                    sVar.f2742b = i2;
                    sVar.f2744d = l7.longValue();
                    sVar.f2743c = l3.longValue();
                    sVar.f2747g = str;
                    sVar.f2745e = false;
                    vVar.a(sVar, wVar);
                    int size = arrayList.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = arrayList.get(i13);
                        i13++;
                        ((Runnable) obj).run();
                    }
                    return;
                }
                C c2 = cArr[i11];
                boolean z5 = (c2.f2647a & keyEvent.getMetaState()) != 0;
                long longValue = l6.longValue();
                long longValue2 = l4.longValue();
                B[] bArr = (B[]) c2.f2648b;
                boolean[] zArr = new boolean[2];
                Boolean[] boolArr2 = new Boolean[2];
                int i14 = 0;
                boolean z6 = false;
                while (i14 < i12) {
                    final B b2 = bArr[i14];
                    boolean[] zArr2 = zArr;
                    boolean containsKey2 = hashMap3.containsKey(Long.valueOf(b2.f2645a));
                    zArr2[i14] = containsKey2;
                    Long l9 = l6;
                    if (b2.f2646b == longValue) {
                        boolean z7 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 != 0) {
                            i9 = 1;
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i10 = 2;
                        } else {
                            i9 = 1;
                            i10 = z7 ? 3 : 1;
                        }
                        int a2 = H.j.a(i10);
                        if (a2 == 0) {
                            hashMap2 = hashMap3;
                            boolArr = boolArr2;
                            i7 = i14;
                            j2 = longValue2;
                            i8 = 2;
                            i6 = i11;
                            boolArr[i7] = Boolean.FALSE;
                            if (!z5) {
                                final int i15 = 0;
                                arrayList.add(new Runnable(this) { // from class: k0.u

                                    /* renamed from: f, reason: collision with root package name */
                                    public final /* synthetic */ v f2750f;

                                    {
                                        this.f2750f = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                v vVar2 = this.f2750f;
                                                vVar2.getClass();
                                                vVar2.b(false, Long.valueOf(b2.f2646b), Long.valueOf(j2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                v vVar3 = this.f2750f;
                                                vVar3.getClass();
                                                vVar3.b(false, Long.valueOf(b2.f2646b), Long.valueOf(j2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (a2 == i9) {
                            i6 = i11;
                            hashMap2 = hashMap3;
                            boolArr = boolArr2;
                            i7 = i14;
                            j2 = longValue2;
                            i8 = 2;
                            boolArr[i7] = Boolean.valueOf(zArr2[i7]);
                        } else if (a2 != 2) {
                            i6 = i11;
                            i8 = 2;
                            hashMap2 = hashMap3;
                            boolArr = boolArr2;
                            i7 = i14;
                            j2 = longValue2;
                        } else {
                            if (z5) {
                                i6 = i11;
                                i8 = 2;
                                hashMap2 = hashMap3;
                                boolArr = boolArr2;
                                i7 = i14;
                                j2 = longValue2;
                            } else {
                                int i16 = i14;
                                final int i17 = 1;
                                i7 = i16;
                                i8 = 2;
                                hashMap2 = hashMap3;
                                boolArr = boolArr2;
                                j2 = longValue2;
                                i6 = i11;
                                arrayList.add(new Runnable(this) { // from class: k0.u

                                    /* renamed from: f, reason: collision with root package name */
                                    public final /* synthetic */ v f2750f;

                                    {
                                        this.f2750f = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i17) {
                                            case 0:
                                                v vVar2 = this.f2750f;
                                                vVar2.getClass();
                                                vVar2.b(false, Long.valueOf(b2.f2646b), Long.valueOf(j2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                v vVar3 = this.f2750f;
                                                vVar3.getClass();
                                                vVar3.b(false, Long.valueOf(b2.f2646b), Long.valueOf(j2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                            boolArr[i7] = Boolean.valueOf(zArr2[i7]);
                        }
                        z6 = true;
                    } else {
                        i6 = i11;
                        hashMap2 = hashMap3;
                        boolArr = boolArr2;
                        i7 = i14;
                        j2 = longValue2;
                        i8 = 2;
                        z6 = z6 || containsKey2;
                    }
                    i14 = i7 + 1;
                    longValue2 = j2;
                    i12 = i8;
                    boolArr2 = boolArr;
                    i11 = i6;
                    zArr = zArr2;
                    l6 = l9;
                    hashMap3 = hashMap2;
                }
                int i18 = i11;
                int i19 = i12;
                boolean[] zArr3 = zArr;
                Long l10 = l6;
                Boolean[] boolArr3 = boolArr2;
                if (z5) {
                    for (int i20 = 0; i20 < i19; i20++) {
                        if (boolArr3[i20] == null) {
                            if (z6) {
                                boolArr3[i20] = Boolean.valueOf(zArr3[i20]);
                            } else {
                                boolArr3[i20] = Boolean.TRUE;
                                z6 = true;
                            }
                        }
                    }
                    if (!z6) {
                        boolArr3[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i21 = 0; i21 < i19; i21++) {
                        if (boolArr3[i21] == null) {
                            boolArr3[i21] = Boolean.FALSE;
                        }
                    }
                }
                for (int i22 = 0; i22 < i19; i22++) {
                    if (zArr3[i22] != boolArr3[i22].booleanValue()) {
                        B b3 = bArr[i22];
                        b(boolArr3[i22].booleanValue(), Long.valueOf(b3.f2646b), Long.valueOf(b3.f2645a), keyEvent.getEventTime());
                    }
                }
                vVar = this;
                i11 = i18 + 1;
                l6 = l10;
            }
        }
        vVar.b(true, 0L, 0L, 0L);
        wVar.a(true);
    }
}
