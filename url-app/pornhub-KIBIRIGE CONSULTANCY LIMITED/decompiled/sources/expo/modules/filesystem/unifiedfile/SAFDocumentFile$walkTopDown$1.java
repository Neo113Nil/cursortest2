package expo.modules.filesystem.unifiedfile;

import android.content.Context;
import android.net.Uri;
import androidx.documentfile.provider.DocumentFile;
import com.facebook.imagepipeline.transcoder.JpegTranscoderUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import org.bouncycastle.asn1.eac.EACTags;

/* compiled from: SAFDocumentFile.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.filesystem.unifiedfile.SAFDocumentFile$walkTopDown$1", f = "SAFDocumentFile.kt", i = {0, 1, 1}, l = {EACTags.HISTORICAL_BYTES, JpegTranscoderUtils.DEFAULT_JPEG_QUALITY}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "$this$forEach$iv"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes2.dex */
final class SAFDocumentFile$walkTopDown$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super SAFDocumentFile>, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SAFDocumentFile this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SAFDocumentFile$walkTopDown$1(SAFDocumentFile sAFDocumentFile, Continuation<? super SAFDocumentFile$walkTopDown$1> continuation) {
        super(2, continuation);
        this.this$0 = sAFDocumentFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SAFDocumentFile$walkTopDown$1 sAFDocumentFile$walkTopDown$1 = new SAFDocumentFile$walkTopDown$1(this.this$0, continuation);
        sAFDocumentFile$walkTopDown$1.L$0 = obj;
        return sAFDocumentFile$walkTopDown$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super SAFDocumentFile> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SAFDocumentFile$walkTopDown$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0096, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        r12 = r11.this$0.getDocumentFile();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r1.yield(r11.this$0, r11) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0094, code lost:
    
        if (r7.yieldAll(r12, r11) == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0094 -> B:6:0x0097). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        DocumentFile documentFile;
        DocumentFile[] listFiles;
        SequenceScope sequenceScope2;
        int length;
        SAFDocumentFile sAFDocumentFile;
        int i;
        DocumentFile[] documentFileArr;
        Context context;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            this.L$0 = sequenceScope;
            this.label = 1;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                length = this.I$1;
                i = this.I$0;
                sAFDocumentFile = (SAFDocumentFile) this.L$2;
                documentFileArr = (DocumentFile[]) this.L$1;
                sequenceScope2 = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                i++;
                if (i < length) {
                    DocumentFile documentFile2 = documentFileArr[i];
                    context = sAFDocumentFile.context;
                    Uri uri = documentFile2.getUri();
                    Intrinsics.checkNotNullExpressionValue(uri, "getUri(...)");
                    Sequence<SAFDocumentFile> walkTopDown = new SAFDocumentFile(context, uri).walkTopDown();
                    this.L$0 = sequenceScope2;
                    this.L$1 = documentFileArr;
                    this.L$2 = sAFDocumentFile;
                    this.I$0 = i;
                    this.I$1 = length;
                    this.label = 2;
                }
                return Unit.INSTANCE;
            }
            sequenceScope = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (this.this$0.isDirectory() && documentFile != null && (listFiles = documentFile.listFiles()) != null) {
            SAFDocumentFile sAFDocumentFile2 = this.this$0;
            sequenceScope2 = sequenceScope;
            length = listFiles.length;
            sAFDocumentFile = sAFDocumentFile2;
            i = 0;
            documentFileArr = listFiles;
            if (i < length) {
            }
        }
        return Unit.INSTANCE;
    }
}
