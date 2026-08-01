package io.ktor.util;

import androidx.work.WorkRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: Nonce.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.NonceKt$nonceGeneratorJob$1", f = "Nonce.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {76}, m = "invokeSuspend", n = {"seedChannel", "previousRoundNonceList", "secureInstance", "weakRandom", "secureBytes", "weakBytes", "randomNonceList", "lastReseed", FirebaseAnalytics.Param.INDEX}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "I$0"})
/* loaded from: classes3.dex */
final class NonceKt$nonceGeneratorJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    NonceKt$nonceGeneratorJob$1(Continuation<? super NonceKt$nonceGeneratorJob$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NonceKt$nonceGeneratorJob$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NonceKt$nonceGeneratorJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f3 A[Catch: all -> 0x014a, TRY_ENTER, TryCatch #2 {all -> 0x014a, blocks: (B:9:0x011a, B:11:0x00f3, B:16:0x0121, B:18:0x0130), top: B:8:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0121 A[Catch: all -> 0x014a, TryCatch #2 {all -> 0x014a, blocks: (B:9:0x011a, B:11:0x00f3, B:16:0x0121, B:18:0x0130), top: B:8:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[Catch: all -> 0x0046, LOOP:1: B:23:0x0083->B:24:0x0085, LOOP_END, TryCatch #0 {all -> 0x0046, blocks: (B:6:0x002f, B:22:0x007a, B:24:0x0085, B:26:0x008e, B:28:0x009a, B:29:0x00ab, B:31:0x00a8), top: B:5:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:6:0x002f, B:22:0x007a, B:24:0x0085, B:26:0x008e, B:28:0x009a, B:29:0x00ab, B:31:0x00a8), top: B:5:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:6:0x002f, B:22:0x007a, B:24:0x0085, B:26:0x008e, B:28:0x009a, B:29:0x00ab, B:31:0x00a8), top: B:5:0x002f }] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlinx.coroutines.channels.Channel] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0118 -> B:8:0x011a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d2 -> B:10:0x00f1). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        SecureRandom lookupSecureRandom;
        SecureRandom secureRandom;
        byte[] bArr;
        byte[] bArr2;
        long j;
        Channel<String> channel;
        NonceKt$nonceGeneratorJob$1 nonceKt$nonceGeneratorJob$1;
        int length;
        int i;
        int i2;
        long currentTimeMillis;
        NonceKt$nonceGeneratorJob$1 nonceKt$nonceGeneratorJob$12;
        int size;
        ArrayList arrayList2;
        SecureRandom secureRandom2;
        SecureRandom secureRandom3;
        List list;
        byte[] bArr3;
        byte[] bArr4;
        ?? r11;
        long j2;
        boolean z;
        NonceKt$nonceGeneratorJob$1 nonceKt$nonceGeneratorJob$13;
        Channel<String> channel2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Channel<String> seedChannel = NonceKt.getSeedChannel();
            arrayList = new ArrayList();
            lookupSecureRandom = NonceKt.lookupSecureRandom();
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
            bArr = new byte[128];
            bArr2 = new byte[512];
            secureRandom.setSeed(lookupSecureRandom.generateSeed(128));
            j = 0;
            channel = seedChannel;
            nonceKt$nonceGeneratorJob$1 = this;
            lookupSecureRandom.nextBytes(bArr);
            secureRandom.nextBytes(bArr2);
            length = bArr.length;
            i = 0;
            while (i2 < length) {
            }
            currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j <= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            }
            List plus = kotlin.collections.CollectionsKt.plus((Collection) StringsKt.chunked(CryptoKt.hex(bArr2), 16), (Iterable) arrayList);
            Intrinsics.checkNotNull(secureRandom);
            List shuffled = kotlin.collections.CollectionsKt.shuffled(plus, secureRandom);
            ArrayList arrayList3 = arrayList;
            nonceKt$nonceGeneratorJob$12 = nonceKt$nonceGeneratorJob$1;
            size = shuffled.size() / 2;
            SecureRandom secureRandom4 = lookupSecureRandom;
            arrayList2 = arrayList3;
            SecureRandom secureRandom5 = secureRandom;
            secureRandom2 = secureRandom4;
            secureRandom3 = secureRandom5;
            byte[] bArr5 = bArr;
            list = shuffled;
            byte[] bArr6 = bArr2;
            bArr3 = bArr5;
            long j3 = j;
            bArr4 = bArr6;
            r11 = channel;
            j2 = j3;
            if (i >= size) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = this.I$1;
            int i4 = this.I$0;
            long j4 = this.J$0;
            List list2 = (List) this.L$6;
            byte[] bArr7 = (byte[]) this.L$5;
            bArr3 = (byte[]) this.L$4;
            SecureRandom secureRandom6 = (SecureRandom) this.L$3;
            SecureRandom secureRandom7 = (SecureRandom) this.L$2;
            ArrayList arrayList4 = (ArrayList) this.L$1;
            channel = (Channel) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                nonceKt$nonceGeneratorJob$13 = this;
                z = true;
                list = list2;
                secureRandom3 = secureRandom6;
                bArr4 = bArr7;
                secureRandom2 = secureRandom7;
                arrayList2 = arrayList4;
                channel2 = channel;
                j2 = j4;
            } catch (Throwable th) {
                th = th;
                try {
                    channel.close(th);
                    SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                    throw th2;
                }
            }
            try {
                i = i4 + 1;
                nonceKt$nonceGeneratorJob$12 = nonceKt$nonceGeneratorJob$13;
                r11 = channel2;
                if (i >= size) {
                    nonceKt$nonceGeneratorJob$12.L$0 = r11;
                    nonceKt$nonceGeneratorJob$12.L$1 = arrayList2;
                    nonceKt$nonceGeneratorJob$12.L$2 = secureRandom2;
                    nonceKt$nonceGeneratorJob$12.L$3 = secureRandom3;
                    nonceKt$nonceGeneratorJob$12.L$4 = bArr3;
                    nonceKt$nonceGeneratorJob$12.L$5 = bArr4;
                    nonceKt$nonceGeneratorJob$12.L$6 = list;
                    nonceKt$nonceGeneratorJob$12.J$0 = j2;
                    nonceKt$nonceGeneratorJob$12.I$0 = i;
                    nonceKt$nonceGeneratorJob$12.I$1 = size;
                    z = true;
                    nonceKt$nonceGeneratorJob$12.label = 1;
                    if (r11.send(list.get(i), nonceKt$nonceGeneratorJob$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    nonceKt$nonceGeneratorJob$13 = nonceKt$nonceGeneratorJob$12;
                    i4 = i;
                    channel2 = r11;
                    i = i4 + 1;
                    nonceKt$nonceGeneratorJob$12 = nonceKt$nonceGeneratorJob$13;
                    r11 = channel2;
                    if (i >= size) {
                        arrayList2.clear();
                        int size2 = list.size();
                        for (int size3 = list.size() / 2; size3 < size2; size3++) {
                            arrayList2.add(list.get(size3));
                        }
                        nonceKt$nonceGeneratorJob$1 = nonceKt$nonceGeneratorJob$12;
                        arrayList = arrayList2;
                        lookupSecureRandom = secureRandom2;
                        secureRandom = secureRandom3;
                        bArr = bArr3;
                        bArr2 = bArr4;
                        long j5 = j2;
                        channel = r11;
                        j = j5;
                        lookupSecureRandom.nextBytes(bArr);
                        secureRandom.nextBytes(bArr2);
                        length = bArr.length;
                        i = 0;
                        for (i2 = 0; i2 < length; i2++) {
                            bArr2[i2 * 4] = bArr[i2];
                        }
                        currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - j <= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                            secureRandom.setSeed(j - currentTimeMillis);
                            secureRandom.setSeed(lookupSecureRandom.generateSeed(bArr.length));
                            j = currentTimeMillis;
                        } else {
                            secureRandom.setSeed(bArr);
                        }
                        List plus2 = kotlin.collections.CollectionsKt.plus((Collection) StringsKt.chunked(CryptoKt.hex(bArr2), 16), (Iterable) arrayList);
                        Intrinsics.checkNotNull(secureRandom);
                        List shuffled2 = kotlin.collections.CollectionsKt.shuffled(plus2, secureRandom);
                        ArrayList arrayList32 = arrayList;
                        nonceKt$nonceGeneratorJob$12 = nonceKt$nonceGeneratorJob$1;
                        size = shuffled2.size() / 2;
                        SecureRandom secureRandom42 = lookupSecureRandom;
                        arrayList2 = arrayList32;
                        SecureRandom secureRandom52 = secureRandom;
                        secureRandom2 = secureRandom42;
                        secureRandom3 = secureRandom52;
                        byte[] bArr52 = bArr;
                        list = shuffled2;
                        byte[] bArr62 = bArr2;
                        bArr3 = bArr52;
                        long j32 = j;
                        bArr4 = bArr62;
                        r11 = channel;
                        j2 = j32;
                        if (i >= size) {
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                channel = channel2;
                channel.close(th);
                SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                return Unit.INSTANCE;
            }
        }
    }
}
