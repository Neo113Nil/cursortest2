package com.startapp.sdk.ads.video.downloader.impl;

import com.startapp.sdk.adsbase.utils.NetworkMonitor$NetworkType;
import com.startapp.sdk.internal.k6;
import com.startapp.sdk.internal.l6;
import com.startapp.sdk.internal.m6;
import com.startapp.sdk.internal.n6;
import com.startapp.sdk.internal.o6;
import com.startapp.sdk.internal.p6;
import com.startapp.sdk.internal.q6;
import com.startapp.sdk.internal.r6;
import com.startapp.sdk.internal.vd;
import com.startapp.sdk.internal.xd;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f106a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public a(int i, int i2, int i3, int i4, int i5) {
        this.f106a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public static final void a(a aVar, File file, k6 k6Var, HttpURLConnection httpURLConnection, xd xdVar, int i, int i2) {
        long j;
        aVar.getClass();
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 206) {
                throw new IOException(responseCode + ' ' + httpURLConnection.getResponseMessage());
            }
            long j2 = k6Var.f299a + k6Var.c;
            long j3 = k6Var.b - j2;
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(j2);
                int i3 = aVar.c;
                byte[] bArr = new byte[i3];
                InputStream inputStream = httpURLConnection.getInputStream();
                long j4 = 0;
                loop0: while (true) {
                    long j5 = 0;
                    while (j4 < j3) {
                        j = j3;
                        try {
                            int read = inputStream.read(bArr, 0, (int) RangesKt.coerceAtMost(j3 - j4, i3));
                            if (read < 1) {
                                break loop0;
                            }
                            randomAccessFile.write(bArr, 0, read);
                            long j6 = read;
                            j4 += j6;
                            j5 += j6;
                            if (xdVar == null || i2 <= 0 || j5 < i2) {
                                j3 = j;
                            }
                        } finally {
                        }
                    }
                    long j7 = (i * 12) + xdVar.e + 8;
                    ByteBuffer putInt = ByteBuffer.allocate(4).putInt((int) (k6Var.c + j4));
                    putInt.flip();
                    xdVar.d.getChannel().write(putInt, j7);
                    j3 = j;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(inputStream, null);
                CloseableKt.closeFinally(randomAccessFile, null);
            } finally {
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0168, code lost:
    
        if (r2 != r10) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(URL url, File file, NetworkMonitor$NetworkType networkMonitor$NetworkType, xd xdVar, int i, String str, String str2, Function3 function3, ContinuationImpl continuationImpl) {
        DownloadEngine$download$1 downloadEngine$download$1;
        int i2;
        Long l;
        try {
            if (continuationImpl instanceof DownloadEngine$download$1) {
                downloadEngine$download$1 = (DownloadEngine$download$1) continuationImpl;
                int i3 = downloadEngine$download$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    downloadEngine$download$1.label = i3 - Integer.MIN_VALUE;
                    DownloadEngine$download$1 downloadEngine$download$12 = downloadEngine$download$1;
                    Object obj = downloadEngine$download$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = downloadEngine$download$12.label;
                    int i4 = 1;
                    HttpURLConnection httpURLConnection = null;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (xdVar != null) {
                            downloadEngine$download$12.L$0 = SpillingKt.nullOutSpilledVariable(url);
                            downloadEngine$download$12.L$1 = SpillingKt.nullOutSpilledVariable(file);
                            downloadEngine$download$12.L$2 = SpillingKt.nullOutSpilledVariable(networkMonitor$NetworkType);
                            downloadEngine$download$12.L$3 = SpillingKt.nullOutSpilledVariable(xdVar);
                            downloadEngine$download$12.L$4 = SpillingKt.nullOutSpilledVariable(str);
                            downloadEngine$download$12.L$5 = SpillingKt.nullOutSpilledVariable(str2);
                            downloadEngine$download$12.L$6 = SpillingKt.nullOutSpilledVariable(function3);
                            downloadEngine$download$12.I$0 = i;
                            downloadEngine$download$12.label = 1;
                            Object a2 = a(url, file, xdVar, i, downloadEngine$download$12);
                            if (a2 != coroutine_suspended) {
                                return a2;
                            }
                        } else {
                            HttpURLConnection a3 = a(this, url, 0L, (Long) null, (String) null, str, str2, 8);
                            try {
                                int responseCode = a3.getResponseCode();
                                if (responseCode == 304) {
                                    o6 o6Var = o6.f360a;
                                    a3.disconnect();
                                    return o6Var;
                                }
                                r6 a4 = a(a3, responseCode);
                                if (responseCode == 206 && (l = a4.f401a) != null) {
                                    long longValue = l.longValue();
                                    int i5 = this.d;
                                    int i6 = this.e;
                                    networkMonitor$NetworkType.getClass();
                                    if (networkMonitor$NetworkType != NetworkMonitor$NetworkType.f157a) {
                                        if (networkMonitor$NetworkType == NetworkMonitor$NetworkType.b) {
                                        }
                                        int i7 = i4;
                                        downloadEngine$download$12.L$0 = SpillingKt.nullOutSpilledVariable(url);
                                        downloadEngine$download$12.L$1 = SpillingKt.nullOutSpilledVariable(file);
                                        downloadEngine$download$12.L$2 = SpillingKt.nullOutSpilledVariable(networkMonitor$NetworkType);
                                        downloadEngine$download$12.L$3 = SpillingKt.nullOutSpilledVariable(xdVar);
                                        downloadEngine$download$12.L$4 = SpillingKt.nullOutSpilledVariable(str);
                                        downloadEngine$download$12.L$5 = SpillingKt.nullOutSpilledVariable(str2);
                                        downloadEngine$download$12.L$6 = SpillingKt.nullOutSpilledVariable(function3);
                                        downloadEngine$download$12.L$7 = SpillingKt.nullOutSpilledVariable(a4);
                                        downloadEngine$download$12.L$8 = SpillingKt.nullOutSpilledVariable(a3);
                                        downloadEngine$download$12.I$0 = i;
                                        downloadEngine$download$12.I$1 = responseCode;
                                        downloadEngine$download$12.I$2 = i7;
                                        downloadEngine$download$12.label = 2;
                                        obj = a(url, file, a3, a4, i7, i, function3, downloadEngine$download$12);
                                    }
                                    i4 = (int) RangesKt.coerceIn(longValue / i5, 1L, i6);
                                    int i72 = i4;
                                    downloadEngine$download$12.L$0 = SpillingKt.nullOutSpilledVariable(url);
                                    downloadEngine$download$12.L$1 = SpillingKt.nullOutSpilledVariable(file);
                                    downloadEngine$download$12.L$2 = SpillingKt.nullOutSpilledVariable(networkMonitor$NetworkType);
                                    downloadEngine$download$12.L$3 = SpillingKt.nullOutSpilledVariable(xdVar);
                                    downloadEngine$download$12.L$4 = SpillingKt.nullOutSpilledVariable(str);
                                    downloadEngine$download$12.L$5 = SpillingKt.nullOutSpilledVariable(str2);
                                    downloadEngine$download$12.L$6 = SpillingKt.nullOutSpilledVariable(function3);
                                    downloadEngine$download$12.L$7 = SpillingKt.nullOutSpilledVariable(a4);
                                    downloadEngine$download$12.L$8 = SpillingKt.nullOutSpilledVariable(a3);
                                    downloadEngine$download$12.I$0 = i;
                                    downloadEngine$download$12.I$1 = responseCode;
                                    downloadEngine$download$12.I$2 = i72;
                                    downloadEngine$download$12.label = 2;
                                    obj = a(url, file, a3, a4, i72, i, function3, downloadEngine$download$12);
                                } else {
                                    if (responseCode / 100 != 2) {
                                        n6 n6Var = new n6(a3.getResponseMessage(), responseCode);
                                        a3.disconnect();
                                        return n6Var;
                                    }
                                    return a(file, a3, a4);
                                }
                            } catch (Throwable th) {
                                th = th;
                                httpURLConnection = a3;
                                try {
                                    return new m6(th);
                                } finally {
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                }
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return (q6) obj;
                }
            }
            if (i2 != 0) {
            }
            return (q6) obj;
        } catch (Throwable th2) {
            th = th2;
        }
        downloadEngine$download$1 = new DownloadEngine$download$1(this, continuationImpl);
        DownloadEngine$download$1 downloadEngine$download$122 = downloadEngine$download$1;
        Object obj2 = downloadEngine$download$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = downloadEngine$download$122.label;
        int i42 = 1;
        HttpURLConnection httpURLConnection2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(URL url, File file, xd xdVar, int i, ContinuationImpl continuationImpl) {
        DownloadEngine$downloadResume$1 downloadEngine$downloadResume$1;
        a aVar;
        int i2;
        xd xdVar2;
        long j;
        try {
            if (continuationImpl instanceof DownloadEngine$downloadResume$1) {
                downloadEngine$downloadResume$1 = (DownloadEngine$downloadResume$1) continuationImpl;
                int i3 = downloadEngine$downloadResume$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    downloadEngine$downloadResume$1.label = i3 - Integer.MIN_VALUE;
                    aVar = this;
                    DownloadEngine$downloadResume$1 downloadEngine$downloadResume$12 = downloadEngine$downloadResume$1;
                    Object obj = downloadEngine$downloadResume$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = downloadEngine$downloadResume$12.label;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        List list = xdVar.c;
                        if (list.isEmpty()) {
                            return p6.f375a;
                        }
                        long j2 = ((vd) CollectionsKt.last(list)).b;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        int i4 = 0;
                        int i5 = 0;
                        for (Object obj2 : list) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            arrayList.add(TuplesKt.to(Boxing.boxInt(i5), (vd) obj2));
                            i5 = i6;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        while (i4 < size) {
                            Object obj3 = arrayList.get(i4);
                            i4++;
                            vd vdVar = (vd) ((Pair) obj3).component2();
                            if (vdVar.c < vdVar.b - vdVar.f468a) {
                                arrayList2.add(obj3);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return new l6(j2, xdVar.f497a, xdVar.b);
                        }
                        DownloadEngine$downloadResume$2 downloadEngine$downloadResume$2 = new DownloadEngine$downloadResume$2(arrayList2, aVar, url, xdVar, file, i, null);
                        downloadEngine$downloadResume$12.L$0 = SpillingKt.nullOutSpilledVariable(url);
                        downloadEngine$downloadResume$12.L$1 = SpillingKt.nullOutSpilledVariable(file);
                        downloadEngine$downloadResume$12.L$2 = xdVar;
                        downloadEngine$downloadResume$12.L$3 = SpillingKt.nullOutSpilledVariable(list);
                        downloadEngine$downloadResume$12.L$4 = SpillingKt.nullOutSpilledVariable(arrayList2);
                        downloadEngine$downloadResume$12.I$0 = i;
                        downloadEngine$downloadResume$12.J$0 = j2;
                        downloadEngine$downloadResume$12.label = 1;
                        if (CoroutineScopeKt.coroutineScope(downloadEngine$downloadResume$2, downloadEngine$downloadResume$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        xdVar2 = xdVar;
                        j = j2;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = downloadEngine$downloadResume$12.J$0;
                        xdVar2 = (xd) downloadEngine$downloadResume$12.L$2;
                        ResultKt.throwOnFailure(obj);
                    }
                    return new l6(j, xdVar2.f497a, xdVar2.b);
                }
            }
            if (i2 != 0) {
            }
            return new l6(j, xdVar2.f497a, xdVar2.b);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new m6(th);
        }
        aVar = this;
        downloadEngine$downloadResume$1 = new DownloadEngine$downloadResume$1(aVar, continuationImpl);
        DownloadEngine$downloadResume$1 downloadEngine$downloadResume$122 = downloadEngine$downloadResume$1;
        Object obj4 = downloadEngine$downloadResume$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = downloadEngine$downloadResume$122.label;
    }

    public final q6 a(File file, HttpURLConnection httpURLConnection, r6 r6Var) {
        try {
            Ref.LongRef longRef = new Ref.LongRef();
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[this.c];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read < 1) {
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(fileOutputStream, null);
                            CloseableKt.closeFinally(inputStream, null);
                            return new l6(longRef.element, r6Var.c, r6Var.d);
                        }
                        fileOutputStream.write(bArr, 0, read);
                        longRef.element += read;
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                return new m6(th);
            } finally {
                httpURLConnection.disconnect();
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01b1: IF  (r11 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:89:0x01b8, block:B:87:0x01b1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(URL url, File file, HttpURLConnection httpURLConnection, r6 r6Var, int i, int i2, Function3 function3, ContinuationImpl continuationImpl) {
        DownloadEngine$downloadParallel$1 downloadEngine$downloadParallel$1;
        int i3;
        xd xdVar;
        xd xdVar2;
        long j;
        xd xdVar3;
        CancellationException e;
        r6 r6Var2 = r6Var;
        try {
            try {
                if (continuationImpl instanceof DownloadEngine$downloadParallel$1) {
                    downloadEngine$downloadParallel$1 = (DownloadEngine$downloadParallel$1) continuationImpl;
                    int i4 = downloadEngine$downloadParallel$1.label;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        downloadEngine$downloadParallel$1.label = i4 - Integer.MIN_VALUE;
                        Object obj = downloadEngine$downloadParallel$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i3 = downloadEngine$downloadParallel$1.label;
                        if (i3 != 0) {
                            ResultKt.throwOnFailure(obj);
                            Long l = r6Var2.f401a;
                            l.getClass();
                            long longValue = l.longValue();
                            try {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                                try {
                                    randomAccessFile.setLength(longValue);
                                    Unit unit = Unit.INSTANCE;
                                    CloseableKt.closeFinally(randomAccessFile, null);
                                    long j2 = i;
                                    long j3 = ((longValue + j2) - 1) / j2;
                                    IntRange until = RangesKt.until(0, i);
                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
                                    Iterator<Integer> it = until.iterator();
                                    while (it.hasNext()) {
                                        long nextInt = ((IntIterator) it).nextInt() * j3;
                                        arrayList.add(new k6(nextInt, Math.min(nextInt + j3, longValue)));
                                        downloadEngine$downloadParallel$1 = downloadEngine$downloadParallel$1;
                                    }
                                    DownloadEngine$downloadParallel$1 downloadEngine$downloadParallel$12 = downloadEngine$downloadParallel$1;
                                    ArrayList arrayList2 = new ArrayList();
                                    int size = arrayList.size();
                                    int i5 = 0;
                                    while (i5 < size) {
                                        Object obj2 = arrayList.get(i5);
                                        i5++;
                                        k6 k6Var = (k6) obj2;
                                        long j4 = longValue;
                                        int i6 = size;
                                        if (k6Var.b > k6Var.f299a) {
                                            arrayList2.add(obj2);
                                        }
                                        size = i6;
                                        longValue = j4;
                                    }
                                    long j5 = longValue;
                                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                                    int size2 = arrayList2.size();
                                    int i7 = 0;
                                    while (i7 < size2) {
                                        Object obj3 = arrayList2.get(i7);
                                        i7++;
                                        k6 k6Var2 = (k6) obj3;
                                        arrayList3.add(new vd((int) k6Var2.f299a, (int) k6Var2.b, 0));
                                    }
                                    xdVar2 = function3 != null ? (xd) function3.invoke(r6Var2.c, r6Var2.d, arrayList3) : null;
                                    try {
                                        j = j5;
                                        DownloadEngine$downloadParallel$3 downloadEngine$downloadParallel$3 = new DownloadEngine$downloadParallel$3(arrayList2, httpURLConnection, this, url, file, xdVar2, i2, null);
                                        downloadEngine$downloadParallel$12.L$0 = SpillingKt.nullOutSpilledVariable(url);
                                        downloadEngine$downloadParallel$12.L$1 = SpillingKt.nullOutSpilledVariable(file);
                                        downloadEngine$downloadParallel$12.L$2 = SpillingKt.nullOutSpilledVariable(httpURLConnection);
                                        downloadEngine$downloadParallel$12.L$3 = r6Var2;
                                        downloadEngine$downloadParallel$12.L$4 = SpillingKt.nullOutSpilledVariable(function3);
                                        downloadEngine$downloadParallel$12.L$5 = SpillingKt.nullOutSpilledVariable(arrayList2);
                                        downloadEngine$downloadParallel$12.L$6 = SpillingKt.nullOutSpilledVariable(arrayList3);
                                        downloadEngine$downloadParallel$12.L$7 = xdVar2;
                                        downloadEngine$downloadParallel$12.I$0 = i;
                                        downloadEngine$downloadParallel$12.I$1 = i2;
                                        downloadEngine$downloadParallel$12.J$0 = j;
                                        downloadEngine$downloadParallel$12.J$1 = j3;
                                        downloadEngine$downloadParallel$12.label = 1;
                                        if (CoroutineScopeKt.coroutineScope(downloadEngine$downloadParallel$3, downloadEngine$downloadParallel$12) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } catch (CancellationException e2) {
                                        throw e2;
                                    } catch (Throwable th) {
                                        th = th;
                                        m6 m6Var = new m6(th);
                                        if (xdVar2 != null) {
                                            xdVar2.d.close();
                                        }
                                        return m6Var;
                                    }
                                } finally {
                                }
                            } catch (Throwable th2) {
                                httpURLConnection.disconnect();
                                return new m6(th2);
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            long j6 = downloadEngine$downloadParallel$1.J$0;
                            xdVar3 = (xd) downloadEngine$downloadParallel$1.L$7;
                            r6 r6Var3 = (r6) downloadEngine$downloadParallel$1.L$3;
                            try {
                                ResultKt.throwOnFailure(obj);
                                xdVar2 = xdVar3;
                                j = j6;
                                r6Var2 = r6Var3;
                            } catch (CancellationException e3) {
                                e = e3;
                                throw e;
                            } catch (Throwable th3) {
                                th = th3;
                                xdVar2 = xdVar3;
                                m6 m6Var2 = new m6(th);
                                if (xdVar2 != null) {
                                }
                                return m6Var2;
                            }
                        }
                        l6 l6Var = new l6(j, r6Var2.c, r6Var2.d);
                        if (xdVar2 != null) {
                            xdVar2.d.close();
                        }
                        return l6Var;
                    }
                }
                l6 l6Var2 = new l6(j, r6Var2.c, r6Var2.d);
                if (xdVar2 != null) {
                }
                return l6Var2;
            } catch (CancellationException e4) {
                e = e4;
                xdVar3 = xdVar2;
                throw e;
            } catch (Throwable th4) {
                th = th4;
                xdVar3 = xdVar2;
                xdVar2 = xdVar3;
                m6 m6Var22 = new m6(th);
                if (xdVar2 != null) {
                }
                return m6Var22;
            }
            if (i3 != 0) {
            }
        } catch (Throwable th5) {
            if (xdVar != null) {
                xdVar.d.close();
            }
            throw th5;
        }
        downloadEngine$downloadParallel$1 = new DownloadEngine$downloadParallel$1(this, continuationImpl);
        Object obj4 = downloadEngine$downloadParallel$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = downloadEngine$downloadParallel$1.label;
    }

    public static HttpURLConnection a(a aVar, URL url, long j, Long l, String str, String str2, String str3, int i) {
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        aVar.getClass();
        URLConnection openConnection = url.openConnection();
        openConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setConnectTimeout(aVar.f106a);
        httpURLConnection.setReadTimeout(aVar.b);
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        StringBuilder append = new StringBuilder("bytes=").append(j).append('-');
        Object obj = l;
        if (l == null) {
            obj = "";
        }
        httpURLConnection.setRequestProperty("Range", append.append(obj).toString());
        if (str != null) {
            httpURLConnection.setRequestProperty("If-Range", str);
        }
        if (str2 != null) {
            httpURLConnection.setRequestProperty("If-None-Match", str2);
        }
        if (str3 != null) {
            httpURLConnection.setRequestProperty("If-Modified-Since", str3);
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public static r6 a(HttpURLConnection httpURLConnection, int i) {
        String headerField;
        Long longOrNull;
        String headerField2;
        String substringAfterLast$default;
        Long l = null;
        if (i != 206 ? !((headerField = httpURLConnection.getHeaderField("Content-Length")) == null || (longOrNull = StringsKt.toLongOrNull(headerField)) == null || longOrNull.longValue() <= 0) : !((headerField2 = httpURLConnection.getHeaderField("Content-Range")) == null || (substringAfterLast$default = StringsKt.substringAfterLast$default(headerField2, IOUtils.DIR_SEPARATOR_UNIX, (String) null, 2, (Object) null)) == null || (longOrNull = StringsKt.toLongOrNull(substringAfterLast$default)) == null || longOrNull.longValue() <= 0)) {
            l = longOrNull;
        }
        return new r6(l, i == 206, httpURLConnection.getHeaderField("ETag"), httpURLConnection.getHeaderField("Last-Modified"));
    }
}
