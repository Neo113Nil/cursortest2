package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Process;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l5 implements w7.a, b7.i, a8.m, yd, f8.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2498d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2499e;

    /* renamed from: i, reason: collision with root package name */
    public Object f2500i;

    public l5(int i3) {
        this.f2498d = i3;
        switch (i3) {
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                this.f2499e = new TreeMap();
                this.f2500i = new TreeMap();
                break;
            default:
                this.f2499e = new HashMap();
                this.f2500i = new k5(6);
                k5 k5Var = new k5(0);
                o5 o5Var = o5.BITWISE_AND;
                ArrayList arrayList = k5Var.f2445a;
                arrayList.add(o5Var);
                arrayList.add(o5.BITWISE_LEFT_SHIFT);
                arrayList.add(o5.BITWISE_NOT);
                arrayList.add(o5.BITWISE_OR);
                arrayList.add(o5.BITWISE_RIGHT_SHIFT);
                arrayList.add(o5.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(o5.BITWISE_XOR);
                c(k5Var);
                k5 k5Var2 = new k5(1);
                o5 o5Var2 = o5.EQUALS;
                ArrayList arrayList2 = k5Var2.f2445a;
                arrayList2.add(o5Var2);
                arrayList2.add(o5.GREATER_THAN);
                arrayList2.add(o5.GREATER_THAN_EQUALS);
                arrayList2.add(o5.IDENTITY_EQUALS);
                arrayList2.add(o5.IDENTITY_NOT_EQUALS);
                arrayList2.add(o5.LESS_THAN);
                arrayList2.add(o5.LESS_THAN_EQUALS);
                arrayList2.add(o5.NOT_EQUALS);
                c(k5Var2);
                k5 k5Var3 = new k5(2);
                o5 o5Var3 = o5.APPLY;
                ArrayList arrayList3 = k5Var3.f2445a;
                arrayList3.add(o5Var3);
                arrayList3.add(o5.BLOCK);
                arrayList3.add(o5.BREAK);
                arrayList3.add(o5.CASE);
                arrayList3.add(o5.DEFAULT);
                arrayList3.add(o5.CONTINUE);
                arrayList3.add(o5.DEFINE_FUNCTION);
                arrayList3.add(o5.FN);
                arrayList3.add(o5.IF);
                arrayList3.add(o5.QUOTE);
                arrayList3.add(o5.RETURN);
                arrayList3.add(o5.SWITCH);
                arrayList3.add(o5.TERNARY);
                c(k5Var3);
                k5 k5Var4 = new k5(3);
                o5 o5Var4 = o5.AND;
                ArrayList arrayList4 = k5Var4.f2445a;
                arrayList4.add(o5Var4);
                arrayList4.add(o5.NOT);
                arrayList4.add(o5.OR);
                c(k5Var4);
                k5 k5Var5 = new k5(4);
                o5 o5Var5 = o5.FOR_IN;
                ArrayList arrayList5 = k5Var5.f2445a;
                arrayList5.add(o5Var5);
                arrayList5.add(o5.FOR_IN_CONST);
                arrayList5.add(o5.FOR_IN_LET);
                arrayList5.add(o5.FOR_LET);
                arrayList5.add(o5.FOR_OF);
                arrayList5.add(o5.FOR_OF_CONST);
                arrayList5.add(o5.FOR_OF_LET);
                arrayList5.add(o5.WHILE);
                c(k5Var5);
                k5 k5Var6 = new k5(5);
                o5 o5Var6 = o5.ADD;
                ArrayList arrayList6 = k5Var6.f2445a;
                arrayList6.add(o5Var6);
                arrayList6.add(o5.DIVIDE);
                arrayList6.add(o5.MODULUS);
                arrayList6.add(o5.MULTIPLY);
                arrayList6.add(o5.NEGATE);
                arrayList6.add(o5.POST_DECREMENT);
                arrayList6.add(o5.POST_INCREMENT);
                arrayList6.add(o5.PRE_DECREMENT);
                arrayList6.add(o5.PRE_INCREMENT);
                arrayList6.add(o5.SUBTRACT);
                c(k5Var6);
                k5 k5Var7 = new k5(7);
                o5 o5Var7 = o5.ASSIGN;
                ArrayList arrayList7 = k5Var7.f2445a;
                arrayList7.add(o5Var7);
                arrayList7.add(o5.CONST);
                arrayList7.add(o5.CREATE_ARRAY);
                arrayList7.add(o5.CREATE_OBJECT);
                arrayList7.add(o5.EXPRESSION_LIST);
                arrayList7.add(o5.GET);
                arrayList7.add(o5.GET_INDEX);
                arrayList7.add(o5.GET_PROPERTY);
                arrayList7.add(o5.NULL);
                arrayList7.add(o5.SET_PROPERTY);
                arrayList7.add(o5.TYPEOF);
                arrayList7.add(o5.UNDEFINED);
                arrayList7.add(o5.VAR);
                c(k5Var7);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.yd
    public Object a(xd xdVar) {
        Uri uri = xdVar.f2988d;
        AtomicLong atomicLong = ne.f2581a;
        int myPid = Process.myPid();
        long id2 = Thread.currentThread().getId();
        long currentTimeMillis = System.currentTimeMillis();
        long andIncrement = ne.f2581a.getAndIncrement();
        int length = String.valueOf(myPid).length();
        int length2 = String.valueOf(id2).length();
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 1 + String.valueOf(currentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb2.append(".mobstore_tmp-");
        sb2.append(myPid);
        sb2.append("-");
        sb2.append(id2);
        sb2.append("-");
        sb2.append(currentTimeMillis);
        sb2.append("-");
        sb2.append(andIncrement);
        Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb2.toString())).build();
        oe oeVar = xdVar.f2985a;
        ArrayList a9 = xdVar.a(oeVar.c(build));
        l5[] l5VarArr = (l5[]) this.f2500i;
        if (l5VarArr != null) {
            l5VarArr[0].d(a9);
        }
        try {
            OutputStream outputStream = (OutputStream) a9.get(0);
            try {
                ((o0) this.f2499e).b(outputStream);
                l5[] l5VarArr2 = (l5[]) this.f2500i;
                if (l5VarArr2 != null) {
                    l5 l5Var = l5VarArr2[0];
                    if (((ie) l5Var.f2500i) == null) {
                        throw new androidx.datastore.preferences.protobuf.k("Cannot sync underlying stream");
                    }
                    ((OutputStream) l5Var.f2499e).flush();
                    ((ie) l5Var.f2500i).f2408d.getFD().sync();
                }
                outputStream.close();
                oeVar.e(build, uri);
                return null;
            } finally {
            }
        } catch (Exception e2) {
            try {
                oeVar.d(build);
            } catch (FileNotFoundException unused) {
            }
            if (e2 instanceof IOException) {
                throw ((IOException) e2);
            }
            throw new IOException(e2);
        }
    }

    @Override // b7.i
    public void accept(Object obj, Object obj2) {
        int i3 = da.f2231k;
        ba baVar = new ba((w7.g) obj2);
        ea eaVar = (ea) ((fa) obj).m();
        String[] strArr = (String[]) this.f2500i;
        String str = (String) this.f2499e;
        Parcel F = eaVar.F();
        r5.c(F, baVar);
        F.writeString(str);
        F.writeInt(0);
        F.writeStringArray(strArr);
        F.writeByteArray(null);
        eaVar.G(F, 1);
    }

    public kc b(String str, boolean z10, int i3) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f2499e;
        kc kcVar = (kc) atomicReferenceArray.get(i3);
        if (kcVar != null) {
            return kcVar;
        }
        gc c10 = ((v5) this.f2500i).c(str, z10);
        while (!atomicReferenceArray.compareAndSet(i3, null, c10)) {
            if (atomicReferenceArray.get(i3) != null) {
                kc kcVar2 = (kc) atomicReferenceArray.get(i3);
                kcVar2.getClass();
                return kcVar2;
            }
        }
        return c10;
    }

    public void c(k5 k5Var) {
        ArrayList arrayList = k5Var.f2445a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((HashMap) this.f2499e).put(Integer.valueOf(((o5) obj).f2635d).toString(), k5Var);
        }
    }

    @Override // f8.y
    public ListenableFuture call() {
        switch (this.f2498d) {
            case 9:
                re reVar = (re) this.f2500i;
                String valueOf = String.valueOf(reVar.f2756a);
                h1 h1Var = reVar.f2762h;
                String concat = "Initialize ".concat(valueOf);
                h1Var.getClass();
                tf d10 = h1.d(concat);
                try {
                    synchronized (reVar.g) {
                        try {
                            if (((List) this.f2499e) == null) {
                                this.f2499e = reVar.f2763i;
                                reVar.f2763i = Collections.EMPTY_LIST;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ArrayList arrayList = new ArrayList(((List) this.f2499e).size());
                    xe xeVar = new xe((re) this.f2500i);
                    Iterator it = ((List) this.f2499e).iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(((f8.z) it.next()).apply(xeVar));
                        } catch (Exception e2) {
                            arrayList.add(f8.l0.c(e2));
                        }
                    }
                    b8.g m10 = b8.g.m(arrayList);
                    a aVar = new a(2, this);
                    f8.c0 c0Var = new f8.c0(m10, true);
                    c0Var.B = new f8.b0(c0Var, aVar);
                    c0Var.s();
                    d10.a(c0Var);
                    d10.close();
                    return c0Var;
                } catch (Throwable th2) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                bg bgVar = (bg) this.f2499e;
                ag c10 = mf.c();
                bg b10 = mf.b(c10, bgVar);
                try {
                    ListenableFuture call = ((f8.y) this.f2500i).call();
                    mf.b(c10, b10);
                    call.getClass();
                    return call;
                } finally {
                }
        }
    }

    public void d(ArrayList arrayList) {
        OutputStream outputStream = (OutputStream) i7.a.P(arrayList);
        if (outputStream instanceof ie) {
            this.f2500i = (ie) outputStream;
            this.f2499e = (OutputStream) arrayList.get(0);
        }
    }

    public f5 e(e7 e7Var, f5 f5Var) {
        ia.y(e7Var);
        if (!(f5Var instanceof g5)) {
            return f5Var;
        }
        g5 g5Var = (g5) f5Var;
        ArrayList arrayList = g5Var.f2327e;
        String str = g5Var.f2326d;
        HashMap hashMap = (HashMap) this.f2499e;
        return (hashMap.containsKey(str) ? (k5) hashMap.get(str) : (k5) this.f2500i).a(str, e7Var, arrayList);
    }

    @Override // w7.a
    public Object f(Task task) {
        boolean z10 = task.getException() instanceof a7.n;
        cb cbVar = (cb) this.f2500i;
        da daVar = (da) this.f2499e;
        if (z10) {
            return daVar.c(cbVar.t());
        }
        if (!(task.getException() instanceof a7.e)) {
            return task;
        }
        a7.e eVar = (a7.e) task.getException();
        eVar.getClass();
        return eVar.f316d.f2119d == 29514 ? daVar.c(cbVar.t()) : task;
    }

    public kc g(int i3, long j, String str) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f2499e;
        kc kcVar = (kc) atomicReferenceArray.get(i3);
        if (kcVar != null) {
            return kcVar;
        }
        ic icVar = new ic(str, (z6.j) ((v5) this.f2500i).f2870e, j);
        while (!atomicReferenceArray.compareAndSet(i3, null, icVar)) {
            if (atomicReferenceArray.get(i3) != null) {
                kc kcVar2 = (kc) atomicReferenceArray.get(i3);
                kcVar2.getClass();
                return kcVar2;
            }
        }
        return icVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // a8.m
    public Object get() {
        long j;
        char c10;
        long j3;
        long j10;
        char c11;
        long j11;
        char c12;
        long j12;
        char c13;
        long j13;
        long j14;
        char c14;
        char c15;
        switch (this.f2498d) {
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                a1.n nVar = (a1.n) this.f2499e;
                String str = (String) this.f2500i;
                int i3 = c8.c.f2008a;
                int i10 = c8.e.f2015i;
                c8.d c16 = new c8.d().c(str.getBytes());
                ByteBuffer byteBuffer = c16.f2009a;
                byteBuffer.put((byte) 0);
                if (byteBuffer.remaining() < 8) {
                    c16.a();
                }
                c8.d c17 = c16.c("".getBytes());
                c17.a();
                ByteBuffer byteBuffer2 = c17.f2009a;
                byteBuffer2.flip();
                if (byteBuffer2.remaining() > 0) {
                    c17.f2014f = byteBuffer2.remaining() + c17.f2014f;
                    long j15 = 0;
                    switch (byteBuffer2.remaining()) {
                        case 1:
                            j = 0;
                            j14 = j ^ (byteBuffer2.get(0) & 255);
                            c17.f2012d = (Long.rotateLeft(j14 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c17.f2012d;
                            c17.f2013e ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 2:
                            c10 = '\b';
                            j3 = 0;
                            j = j3 ^ ((byteBuffer2.get(1) & 255) << c10);
                            j14 = j ^ (byteBuffer2.get(0) & 255);
                            c17.f2012d = (Long.rotateLeft(j14 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c17.f2012d;
                            c17.f2013e ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            c10 = '\b';
                            j10 = 0;
                            j3 = j10 ^ ((byteBuffer2.get(2) & 255) << 16);
                            j = j3 ^ ((byteBuffer2.get(1) & 255) << c10);
                            j14 = j ^ (byteBuffer2.get(0) & 255);
                            c17.f2012d = (Long.rotateLeft(j14 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c17.f2012d;
                            c17.f2013e ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            c10 = '\b';
                            c11 = 24;
                            j11 = 0;
                            j10 = j11 ^ ((byteBuffer2.get(3) & 255) << c11);
                            j3 = j10 ^ ((byteBuffer2.get(2) & 255) << 16);
                            j = j3 ^ ((byteBuffer2.get(1) & 255) << c10);
                            j14 = j ^ (byteBuffer2.get(0) & 255);
                            c17.f2012d = (Long.rotateLeft(j14 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c17.f2012d;
                            c17.f2013e ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            c10 = '\b';
                            c12 = ' ';
                            c11 = 24;
                            j12 = 0;
                            j11 = j12 ^ ((byteBuffer2.get(4) & 255) << c12);
                            j10 = j11 ^ ((byteBuffer2.get(3) & 255) << c11);
                            j3 = j10 ^ ((byteBuffer2.get(2) & 255) << 16);
                            j = j3 ^ ((byteBuffer2.get(1) & 255) << c10);
                            j14 = j ^ (byteBuffer2.get(0) & 255);
                            c17.f2012d = (Long.rotateLeft(j14 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c17.f2012d;
                            c17.f2013e ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            c13 = 24;
                            c12 = ' ';
                            j13 = 0;
                            c10 = '\b';
                            c11 = c13;
                            j12 = ((byteBuffer2.get(5) & 255) << 40) ^ j13;
                            j11 = j12 ^ ((byteBuffer2.get(4) & 255) << c12);
                            j10 = j11 ^ ((byteBuffer2.get(3) & 255) << c11);
                            j3 = j10 ^ ((byteBuffer2.get(2) & 255) << 16);
                            j = j3 ^ ((byteBuffer2.get(1) & 255) << c10);
                            j14 = j ^ (byteBuffer2.get(0) & 255);
                            c17.f2012d = (Long.rotateLeft(j14 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c17.f2012d;
                            c17.f2013e ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            c13 = 24;
                            c12 = ' ';
                            j13 = (byteBuffer2.get(6) & 255) << 48;
                            c10 = '\b';
                            c11 = c13;
                            j12 = ((byteBuffer2.get(5) & 255) << 40) ^ j13;
                            j11 = j12 ^ ((byteBuffer2.get(4) & 255) << c12);
                            j10 = j11 ^ ((byteBuffer2.get(3) & 255) << c11);
                            j3 = j10 ^ ((byteBuffer2.get(2) & 255) << 16);
                            j = j3 ^ ((byteBuffer2.get(1) & 255) << c10);
                            j14 = j ^ (byteBuffer2.get(0) & 255);
                            c17.f2012d = (Long.rotateLeft(j14 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c17.f2012d;
                            c17.f2013e ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                            j14 = byteBuffer2.getLong();
                            c17.f2012d = (Long.rotateLeft(j14 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c17.f2012d;
                            c17.f2013e ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 9:
                            j15 ^= byteBuffer2.get(8) & 255;
                            j14 = byteBuffer2.getLong();
                            c17.f2012d = (Long.rotateLeft(j14 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c17.f2012d;
                            c17.f2013e ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 10:
                            j15 ^= (byteBuffer2.get(9) & 255) << 8;
                            j15 ^= byteBuffer2.get(8) & 255;
                            j14 = byteBuffer2.getLong();
                            c17.f2012d = (Long.rotateLeft(j14 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c17.f2012d;
                            c17.f2013e ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            j15 ^= (byteBuffer2.get(10) & 255) << 16;
                            j15 ^= (byteBuffer2.get(9) & 255) << 8;
                            j15 ^= byteBuffer2.get(8) & 255;
                            j14 = byteBuffer2.getLong();
                            c17.f2012d = (Long.rotateLeft(j14 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c17.f2012d;
                            c17.f2013e ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 12:
                            c14 = 24;
                            j15 ^= (byteBuffer2.get(11) & 255) << c14;
                            j15 ^= (byteBuffer2.get(10) & 255) << 16;
                            j15 ^= (byteBuffer2.get(9) & 255) << 8;
                            j15 ^= byteBuffer2.get(8) & 255;
                            j14 = byteBuffer2.getLong();
                            c17.f2012d = (Long.rotateLeft(j14 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c17.f2012d;
                            c17.f2013e ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 13:
                            c14 = 24;
                            c15 = ' ';
                            j15 ^= (byteBuffer2.get(12) & 255) << c15;
                            j15 ^= (byteBuffer2.get(11) & 255) << c14;
                            j15 ^= (byteBuffer2.get(10) & 255) << 16;
                            j15 ^= (byteBuffer2.get(9) & 255) << 8;
                            j15 ^= byteBuffer2.get(8) & 255;
                            j14 = byteBuffer2.getLong();
                            c17.f2012d = (Long.rotateLeft(j14 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c17.f2012d;
                            c17.f2013e ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 14:
                            c14 = 24;
                            c15 = ' ';
                            j15 ^= (byteBuffer2.get(13) & 255) << 40;
                            j15 ^= (byteBuffer2.get(12) & 255) << c15;
                            j15 ^= (byteBuffer2.get(11) & 255) << c14;
                            j15 ^= (byteBuffer2.get(10) & 255) << 16;
                            j15 ^= (byteBuffer2.get(9) & 255) << 8;
                            j15 ^= byteBuffer2.get(8) & 255;
                            j14 = byteBuffer2.getLong();
                            c17.f2012d = (Long.rotateLeft(j14 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c17.f2012d;
                            c17.f2013e ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        case 15:
                            j15 = (byteBuffer2.get(14) & 255) << 48;
                            c14 = 24;
                            c15 = ' ';
                            j15 ^= (byteBuffer2.get(13) & 255) << 40;
                            j15 ^= (byteBuffer2.get(12) & 255) << c15;
                            j15 ^= (byteBuffer2.get(11) & 255) << c14;
                            j15 ^= (byteBuffer2.get(10) & 255) << 16;
                            j15 ^= (byteBuffer2.get(9) & 255) << 8;
                            j15 ^= byteBuffer2.get(8) & 255;
                            j14 = byteBuffer2.getLong();
                            c17.f2012d = (Long.rotateLeft(j14 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ c17.f2012d;
                            c17.f2013e ^= Long.rotateLeft(j15 * 5545529020109919103L, 33) * (-8663945395140668459L);
                            byteBuffer2.position(byteBuffer2.limit());
                            break;
                        default:
                            throw new AssertionError("Should never get here.");
                    }
                }
                long j16 = c17.f2012d;
                long j17 = c17.f2014f;
                long j18 = j16 ^ j17;
                long j19 = j17 ^ c17.f2013e;
                long j20 = j18 + j19;
                long j21 = j19 + j20;
                long j22 = (j20 ^ (j20 >>> 33)) * (-49064778989728563L);
                long j23 = (j22 ^ (j22 >>> 33)) * (-4265267296055464877L);
                long j24 = (j21 ^ (j21 >>> 33)) * (-49064778989728563L);
                long j25 = (j24 ^ (j24 >>> 33)) * (-4265267296055464877L);
                long j26 = j25 ^ (j25 >>> 33);
                long j27 = (j23 ^ (j23 >>> 33)) + j26;
                c17.f2012d = j27;
                c17.f2013e = j26 + j27;
                byte[] array = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(c17.f2012d).putLong(c17.f2013e).array();
                char[] cArr = c8.b.f2007d;
                new c8.a(array);
                return ((d8.c) nVar.f41i).a((byte[]) array.clone());
            default:
                return ((d8.c) ((a1.n) this.f2499e).f41i).a(((v0) this.f2500i).n());
        }
    }

    public void h(e7 e7Var, a1.n nVar) {
        ka kaVar = new ka(nVar);
        TreeMap treeMap = (TreeMap) this.f2499e;
        for (Integer num : treeMap.keySet()) {
            b clone = ((b) nVar.f40e).clone();
            f5 a9 = ((e5) treeMap.get(num)).a(e7Var, Collections.singletonList(kaVar));
            int p4 = a9 instanceof l3 ? ia.p(((l3) a9).f2496d.doubleValue()) : -1;
            if (p4 == 2 || p4 == -1) {
                nVar.f40e = clone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f2500i;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            f5 a10 = ((e5) treeMap2.get((Integer) it.next())).a(e7Var, Collections.singletonList(kaVar));
            if (a10 instanceof l3) {
                ia.p(((l3) a10).f2496d.doubleValue());
            }
        }
    }

    public kc i(int i3, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f2499e;
        kc kcVar = (kc) atomicReferenceArray.get(i3);
        if (kcVar != null) {
            return kcVar;
        }
        jc jcVar = new jc(str, (z6.j) ((v5) this.f2500i).f2870e, str2);
        while (!atomicReferenceArray.compareAndSet(i3, null, jcVar)) {
            if (atomicReferenceArray.get(i3) != null) {
                kc kcVar2 = (kc) atomicReferenceArray.get(i3);
                kcVar2.getClass();
                return kcVar2;
            }
        }
        return jcVar;
    }

    public String toString() {
        switch (this.f2498d) {
            case 10:
                f8.y yVar = (f8.y) this.f2500i;
                StringBuilder sb2 = new StringBuilder(yVar.toString().length() + 14);
                sb2.append("propagating=[");
                sb2.append(yVar);
                sb2.append("]");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public l5(o0 o0Var) {
        this.f2498d = 8;
        this.f2499e = o0Var;
    }

    public /* synthetic */ l5(int i3, Object obj, Object obj2) {
        this.f2498d = i3;
        this.f2499e = obj;
        this.f2500i = obj2;
    }

    public l5(v5 v5Var, int i3) {
        this.f2498d = 5;
        this.f2500i = v5Var;
        this.f2499e = new AtomicReferenceArray(i3);
    }

    public l5(fd fdVar, jd jdVar) {
        this.f2498d = 6;
        Objects.requireNonNull(fdVar);
        this.f2500i = fdVar;
        this.f2499e = jdVar;
    }

    public /* synthetic */ l5(re reVar) {
        this.f2498d = 9;
        this.f2500i = reVar;
    }
}
