package com.chartboost.sdk.impl;

import java.io.File;
import java.net.URL;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes11.dex */
public final class z5 implements w3 {
    public final x3 a;
    public final v3 b;
    public final CoroutineDispatcher c;

    public z5(x3 storage, v3 notifier, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(notifier, "notifier");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.a = storage;
        this.b = notifier;
        this.c = ioDispatcher;
    }

    public static final class a extends SuspendLambda implements Function2 {
        public long b;
        public long c;
        public Object d;
        public Object e;
        public Object f;
        public int g;
        public final /* synthetic */ long h;
        public final /* synthetic */ z5 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, z5 z5Var, Continuation continuation) {
            super(2, continuation);
            this.h = j;
            this.i = z5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.h, this.i, continuation);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:37|38|39|40|41|(1:43)(5:44|45|12|13|(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0181, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0185, code lost:
        
            r15 = r5;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00ce A[Catch: Exception -> 0x005d, TryCatch #1 {Exception -> 0x005d, blocks: (B:13:0x00c8, B:15:0x00ce, B:17:0x00db, B:21:0x0102, B:23:0x0106, B:24:0x010c, B:74:0x0053, B:77:0x0070, B:80:0x0079, B:82:0x00b8), top: B:2:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0106 A[Catch: Exception -> 0x005d, TryCatch #1 {Exception -> 0x005d, blocks: (B:13:0x00c8, B:15:0x00ce, B:17:0x00db, B:21:0x0102, B:23:0x0106, B:24:0x010c, B:74:0x0053, B:77:0x0070, B:80:0x0079, B:82:0x00b8), top: B:2:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0124 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01e2 A[Catch: Exception -> 0x01bd, TRY_LEAVE, TryCatch #0 {Exception -> 0x01bd, blocks: (B:28:0x012c, B:32:0x0137, B:50:0x0186, B:34:0x01c0, B:58:0x01e2), top: B:49:0x0186 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x024a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0213 -> B:12:0x01b7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j;
            Object b;
            Iterator it;
            long j2;
            File file;
            String str;
            Exception e;
            long j3;
            Iterator it2;
            Object obj2;
            Object obj3;
            File file2;
            File file3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.g;
            int i2 = 3;
            int i3 = 2;
            try {
            } catch (Exception e2) {
                e = e2;
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j4 = this.h;
                if (j4 <= 0) {
                    return Boxing.boxLong(0L);
                }
                xb.a("Attempting to free " + j4 + " bytes via LRU eviction...", (Throwable) null, 2, (Object) null);
                try {
                    x3 x3Var = this.i.a;
                    this.b = 0L;
                    this.g = 1;
                    b = x3Var.b(this);
                    if (b == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = 0;
                } catch (Exception e3) {
                    e = e3;
                    j = 0;
                    xb.b("LRU eviction error: bytesFreedSoFar=" + j + ", bytesToFree=" + this.h + ", errorType=" + e.getClass().getSimpleName(), e);
                    if (j > 0) {
                    }
                    return Boxing.boxLong(j);
                }
            } else if (i == 1) {
                j = this.b;
                ResultKt.throwOnFailure(obj);
                b = obj;
            } else {
                if (i != 2) {
                    if (i == 3) {
                        j3 = this.c;
                        long j5 = this.b;
                        String str2 = (String) this.f;
                        File file4 = (File) this.e;
                        it2 = (Iterator) this.d;
                        ResultKt.throwOnFailure(obj);
                        j2 = j5;
                        file = file4;
                        str = str2;
                        obj2 = obj;
                        if (((Boolean) obj2).booleanValue()) {
                        }
                        j = j2;
                        it = it2;
                        i2 = 3;
                        i3 = 2;
                        if (it.hasNext()) {
                        }
                        if (j > 0) {
                        }
                        return Boxing.boxLong(j);
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j6 = this.b;
                    str = (String) this.f;
                    file = (File) this.e;
                    Iterator it3 = (Iterator) this.d;
                    try {
                        ResultKt.throwOnFailure(obj);
                        it = it3;
                        j = j6;
                    } catch (Exception e4) {
                        e = e4;
                        j2 = j6;
                        try {
                            xb.e("LRU eviction URL parse failed: url=" + str + ", file=" + file.getName() + ", errorType=" + e.getClass().getSimpleName(), null, 2, null);
                            it = it3;
                            j = j2;
                            i2 = 3;
                            i3 = 2;
                            if (it.hasNext()) {
                            }
                        } catch (Exception e5) {
                            e = e5;
                            j = j2;
                            xb.b("LRU eviction error: bytesFreedSoFar=" + j + ", bytesToFree=" + this.h + ", errorType=" + e.getClass().getSimpleName(), e);
                            if (j > 0) {
                            }
                            return Boxing.boxLong(j);
                        }
                        if (j > 0) {
                        }
                        return Boxing.boxLong(j);
                    }
                    i2 = 3;
                    i3 = 2;
                    if (it.hasNext()) {
                        file2 = (File) it.next();
                        if (j < this.h) {
                            j3 = file2.length();
                            file3 = this.i.a.a(file2);
                            x3 x3Var2 = this.i.a;
                            this.d = it;
                            this.e = file2;
                            this.f = file3;
                            this.b = j;
                            this.c = j3;
                            this.g = i3;
                            obj3 = x3Var2.b(file3, this);
                            if (obj3 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            u3 u3Var = (u3) obj3;
                            String b2 = u3Var == null ? u3Var.b() : null;
                            x3 x3Var3 = this.i.a;
                            this.d = it;
                            this.e = file2;
                            this.f = b2;
                            this.b = j;
                            this.c = j3;
                            this.g = i2;
                            obj2 = x3Var3.a(file2, file3, this);
                            if (obj2 != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            long j7 = j;
                            file = file2;
                            it2 = it;
                            str = b2;
                            j2 = j7;
                            if (((Boolean) obj2).booleanValue()) {
                                xb.e("LRU eviction delete failed: file=" + file.getAbsolutePath() + ", fileSize=" + j3 + ", bytesFreedSoFar=" + j2 + ", bytesToFree=" + this.h, null, 2, null);
                            } else {
                                j2 += j3;
                                xb.a("Evicted (LRU): " + file.getName() + " (" + j3 + " bytes)", (Throwable) null, 2, (Object) null);
                                if (str != null) {
                                    try {
                                    } catch (Exception e6) {
                                        e = e6;
                                    }
                                    URL url = new URL(str);
                                    v3 v3Var = this.i.b;
                                    m8 m8Var = m8.c;
                                    this.d = it2;
                                    this.e = file;
                                    this.f = str;
                                    this.b = j2;
                                    this.g = 4;
                                    if (v3Var.a(url, m8Var, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    it = it2;
                                    j = j2;
                                    i2 = 3;
                                    i3 = 2;
                                    if (it.hasNext()) {
                                    }
                                } else {
                                    xb.e("LRU eviction metadata missing URL: file=" + file.getName() + ", fileSize=" + j3, null, 2, null);
                                }
                            }
                            j = j2;
                            it = it2;
                            i2 = 3;
                            i3 = 2;
                            if (it.hasNext()) {
                            }
                        }
                    }
                    if (j > 0) {
                        xb.a("Freed " + j + " bytes during LRU eviction.", (Throwable) null, 2, (Object) null);
                    }
                    return Boxing.boxLong(j);
                }
                j3 = this.c;
                j = this.b;
                file3 = (File) this.f;
                file2 = (File) this.e;
                it = (Iterator) this.d;
                ResultKt.throwOnFailure(obj);
                obj3 = obj;
                u3 u3Var2 = (u3) obj3;
                if (u3Var2 == null) {
                }
                x3 x3Var32 = this.i.a;
                this.d = it;
                this.e = file2;
                this.f = b2;
                this.b = j;
                this.c = j3;
                this.g = i2;
                obj2 = x3Var32.a(file2, file3, this);
                if (obj2 != coroutine_suspended) {
                }
            }
            it = CollectionsKt.sortedWith((Iterable) b, new C0234a()).iterator();
            if (it.hasNext()) {
            }
            if (j > 0) {
            }
            return Boxing.boxLong(j);
        }

        /* renamed from: com.chartboost.sdk.impl.z5$a$a, reason: collision with other inner class name */
        public static final class C0234a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
            }
        }
    }

    @Override // com.chartboost.sdk.impl.w3
    public Object a(Function0 function0, long j, Continuation continuation) {
        return BuildersKt.withContext(this.c, new a(j, this, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.w3
    public boolean a(u3 u3Var) {
        if (u3Var != null) {
            return System.currentTimeMillis() > u3Var.a();
        }
        xb.e("Cannot check expiry: Metadata is null.", null, 2, null);
        return false;
    }
}
