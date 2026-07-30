package androidx.activity;

import f6.l;
import kotlin.jvm.internal.r;
import y5.w;

/* loaded from: classes.dex */
public final class FullyDrawnReporterKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, y5.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object reportWhenComplete(FullyDrawnReporter fullyDrawnReporter, l lVar, kotlin.coroutines.c cVar) {
        FullyDrawnReporterKt$reportWhenComplete$1 fullyDrawnReporterKt$reportWhenComplete$1;
        Object coroutine_suspended;
        int i8;
        FullyDrawnReporter fullyDrawnReporter2;
        try {
            if (cVar instanceof FullyDrawnReporterKt$reportWhenComplete$1) {
                fullyDrawnReporterKt$reportWhenComplete$1 = (FullyDrawnReporterKt$reportWhenComplete$1) cVar;
                int i9 = fullyDrawnReporterKt$reportWhenComplete$1.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    fullyDrawnReporterKt$reportWhenComplete$1.label = i9 - Integer.MIN_VALUE;
                    Object obj = fullyDrawnReporterKt$reportWhenComplete$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = fullyDrawnReporterKt$reportWhenComplete$1.label;
                    if (i8 != 0) {
                        y5.g.throwOnFailure(obj);
                        fullyDrawnReporter.addReporter();
                        if (fullyDrawnReporter.isFullyDrawnReported()) {
                            return w.INSTANCE;
                        }
                        fullyDrawnReporterKt$reportWhenComplete$1.L$0 = fullyDrawnReporter;
                        fullyDrawnReporterKt$reportWhenComplete$1.label = 1;
                        fullyDrawnReporter2 = fullyDrawnReporter;
                        if (lVar.invoke(fullyDrawnReporterKt$reportWhenComplete$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        FullyDrawnReporter fullyDrawnReporter3 = (FullyDrawnReporter) fullyDrawnReporterKt$reportWhenComplete$1.L$0;
                        y5.g.throwOnFailure(obj);
                        fullyDrawnReporter2 = fullyDrawnReporter3;
                    }
                    r.finallyStart(1);
                    fullyDrawnReporter2.removeReporter();
                    r.finallyEnd(1);
                    fullyDrawnReporter = w.INSTANCE;
                    return fullyDrawnReporter;
                }
            }
            if (i8 != 0) {
            }
            r.finallyStart(1);
            fullyDrawnReporter2.removeReporter();
            r.finallyEnd(1);
            fullyDrawnReporter = w.INSTANCE;
            return fullyDrawnReporter;
        } catch (Throwable th) {
            r.finallyStart(1);
            fullyDrawnReporter.removeReporter();
            r.finallyEnd(1);
            throw th;
        }
        fullyDrawnReporterKt$reportWhenComplete$1 = new FullyDrawnReporterKt$reportWhenComplete$1(cVar);
        Object obj2 = fullyDrawnReporterKt$reportWhenComplete$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = fullyDrawnReporterKt$reportWhenComplete$1.label;
    }

    private static final Object reportWhenComplete$$forInline(FullyDrawnReporter fullyDrawnReporter, l lVar, kotlin.coroutines.c cVar) {
        fullyDrawnReporter.addReporter();
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return w.INSTANCE;
        }
        try {
            lVar.invoke(cVar);
            r.finallyStart(1);
            fullyDrawnReporter.removeReporter();
            r.finallyEnd(1);
            return w.INSTANCE;
        } catch (Throwable th) {
            r.finallyStart(1);
            fullyDrawnReporter.removeReporter();
            r.finallyEnd(1);
            throw th;
        }
    }
}
