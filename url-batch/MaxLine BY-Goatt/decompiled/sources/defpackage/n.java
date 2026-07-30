package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.anrreport.ANRHandler;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import com.facebook.internal.instrument.errorreport.ErrorReportData;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int sendANRReports$lambda$2;
        int sendExceptionReports$lambda$2;
        int sendErrorReports$lambda$0;
        switch (this.a) {
            case 0:
                sendANRReports$lambda$2 = ANRHandler.sendANRReports$lambda$2((InstrumentData) obj, (InstrumentData) obj2);
                return sendANRReports$lambda$2;
            case 1:
                return Intrinsics.c(((x41) obj).b, ((x41) obj2).b);
            case 2:
                sendExceptionReports$lambda$2 = CrashHandler.Companion.sendExceptionReports$lambda$2((InstrumentData) obj, (InstrumentData) obj2);
                return sendExceptionReports$lambda$2;
            case 3:
                sendErrorReports$lambda$0 = ErrorReportHandler.sendErrorReports$lambda$0((ErrorReportData) obj, (ErrorReportData) obj2);
                return sendErrorReports$lambda$0;
            case 4:
                View view = (View) obj;
                View view2 = (View) obj2;
                if (view == view2) {
                    return 0;
                }
                tn1 tn1Var = wo0.d;
                Object g = tn1Var.g(view);
                g.getClass();
                Rect rect = (Rect) g;
                Object g2 = tn1Var.g(view2);
                g2.getClass();
                Rect rect2 = (Rect) g2;
                int i = rect.top - rect2.top;
                return i == 0 ? rect.bottom - rect2.bottom : i;
            case 5:
                View view3 = (View) obj;
                View view4 = (View) obj2;
                if (view3 == view4) {
                    return 0;
                }
                tn1 tn1Var2 = wo0.d;
                Object g3 = tn1Var2.g(view3);
                g3.getClass();
                Rect rect3 = (Rect) g3;
                Object g4 = tn1Var2.g(view4);
                g4.getClass();
                Rect rect4 = (Rect) g4;
                int i2 = rect3.left - rect4.left;
                return i2 == 0 ? (rect3.right - rect4.right) * wo0.c : i2 * wo0.c;
            case 6:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b = bArr[i3];
                    byte b2 = bArr2[i3];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                return (((Number) pair.n).intValue() - ((Number) pair.m).intValue()) - (((Number) pair2.n).intValue() - ((Number) pair2.m).intValue());
            default:
                i91 i91Var = (i91) obj;
                i91 i91Var2 = (i91) obj2;
                float f = i91Var.Q.p.P;
                float f2 = i91Var2.Q.p.P;
                return f == f2 ? Intrinsics.c(i91Var.v(), i91Var2.v()) : Float.compare(f, f2);
        }
    }
}
