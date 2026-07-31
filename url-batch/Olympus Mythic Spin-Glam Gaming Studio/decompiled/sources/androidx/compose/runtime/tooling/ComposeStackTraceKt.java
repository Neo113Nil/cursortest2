package androidx.compose.runtime.tooling;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposeStackTrace.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\r\u001a\u00020\f*\u00060\nj\u0002`\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "trace", "", "tryAttachComposeStackTrace", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)Z", "attachComposeStackTrace", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)Ljava/lang/Throwable;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "appendStackTrace", "(Ljava/lang/StringBuilder;Ljava/util/List;)V", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposeStackTraceKt {
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(3:17|(2:18|(2:20|(1:22)(1:23)))|11)|5|6|(1:8)(1:14)|(1:10)(0)|11) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        r0 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean tryAttachComposeStackTrace(Throwable th, Function0 function0) {
        List suppressedExceptions = ExceptionsKt.getSuppressedExceptions(th);
        boolean z = false;
        if (!(suppressedExceptions instanceof Collection) || !suppressedExceptions.isEmpty()) {
            Iterator it = suppressedExceptions.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Throwable) it.next()) instanceof DiagnosticComposeException) {
                        break;
                    }
                }
            }
            return z;
        }
        List list = (List) function0.mo4828invoke();
        boolean isEmpty = list.isEmpty();
        z = !isEmpty;
        DiagnosticComposeException diagnosticComposeException = !isEmpty ? new DiagnosticComposeException(list) : null;
        if (diagnosticComposeException != null) {
            ExceptionsKt.addSuppressed(th, diagnosticComposeException);
        }
        return z;
    }

    public static final Throwable attachComposeStackTrace(Throwable th, Function0 function0) {
        tryAttachComposeStackTrace(th, function0);
        return th;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void appendStackTrace(StringBuilder sb, List list) {
        String sourceFile;
        String str;
        List createListBuilder = CollectionsKt.createListBuilder();
        List asReversed = CollectionsKt.asReversed(list);
        int size = asReversed.size();
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < size; i++) {
            ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) asReversed.get(i);
            SourceInformation sourceInfo = composeStackTraceFrame.getSourceInfo();
            String functionName = sourceInfo.getFunctionName();
            if (functionName == null) {
                functionName = sourceInfo.getIsCall() ? "<lambda>" : null;
                if (functionName == null) {
                    if (str2 == null) {
                        str2 = "<unknown function>";
                    }
                    sourceFile = sourceInfo.getSourceFile();
                    if (sourceFile == null) {
                        str3 = sourceFile;
                    } else if (str3 == null) {
                        str3 = "<unknown file>";
                    }
                    List locations = sourceInfo.getLocations();
                    if (composeStackTraceFrame.getGroupOffset() == null && composeStackTraceFrame.getGroupOffset().intValue() < locations.size()) {
                        str = String.valueOf(((LocationSourceInformation) locations.get(composeStackTraceFrame.getGroupOffset().intValue())).getLineNumber());
                    } else {
                        str = "<unknown line>";
                    }
                    String str4 = str2 + '(' + str3 + ':' + str + ')';
                    Intrinsics.checkNotNullExpressionValue(str4, "toString(...)");
                    if (!sourceInfo.getIsCall()) {
                    }
                    if (Intrinsics.areEqual(sourceInfo.getFunctionName(), "rememberCompositionContext") || !Intrinsics.areEqual(sourceInfo.getPackageHash(), "9igjgp")) {
                        createListBuilder.add(str4);
                    }
                }
            }
            str2 = functionName;
            sourceFile = sourceInfo.getSourceFile();
            if (sourceFile == null) {
            }
            List locations2 = sourceInfo.getLocations();
            if (composeStackTraceFrame.getGroupOffset() == null) {
            }
            str = "<unknown line>";
            String str42 = str2 + '(' + str3 + ':' + str + ')';
            Intrinsics.checkNotNullExpressionValue(str42, "toString(...)");
            if (!sourceInfo.getIsCall()) {
            }
            if (Intrinsics.areEqual(sourceInfo.getFunctionName(), "rememberCompositionContext")) {
            }
            createListBuilder.add(str42);
        }
        List asReversed2 = CollectionsKt.asReversed(CollectionsKt.build(createListBuilder));
        int size2 = asReversed2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            sb.append("\tat " + ((String) asReversed2.get(i2)));
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        }
    }
}
