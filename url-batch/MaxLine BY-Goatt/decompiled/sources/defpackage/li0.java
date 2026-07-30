package defpackage;

import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentUtility;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class li0 implements FilenameFilter {
    public final /* synthetic */ int a;

    public /* synthetic */ li0(int i) {
        this.a = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean listErrorReportFiles$lambda$3;
        boolean listExceptionReportFiles$lambda$3;
        boolean listAnrReportFiles$lambda$1;
        boolean listExceptionAnalysisReportFiles$lambda$2;
        boolean refreshBestGuessNumberOfCPUCores$lambda$6;
        switch (this.a) {
            case 0:
                listErrorReportFiles$lambda$3 = ErrorReportHandler.listErrorReportFiles$lambda$3(file, str);
                return listErrorReportFiles$lambda$3;
            case 1:
                listExceptionReportFiles$lambda$3 = InstrumentUtility.listExceptionReportFiles$lambda$3(file, str);
                return listExceptionReportFiles$lambda$3;
            case 2:
                listAnrReportFiles$lambda$1 = InstrumentUtility.listAnrReportFiles$lambda$1(file, str);
                return listAnrReportFiles$lambda$1;
            case 3:
                listExceptionAnalysisReportFiles$lambda$2 = InstrumentUtility.listExceptionAnalysisReportFiles$lambda$2(file, str);
                return listExceptionAnalysisReportFiles$lambda$2;
            default:
                refreshBestGuessNumberOfCPUCores$lambda$6 = Utility.refreshBestGuessNumberOfCPUCores$lambda$6(file, str);
                return refreshBestGuessNumberOfCPUCores$lambda$6;
        }
    }
}
