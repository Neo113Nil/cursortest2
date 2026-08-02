package okhttp3.internal.connection;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.investingcrypto.viewmodels.common.orders.PeriodSelectionViewModel;
import com.squareup.protos.franklin.investing.resources.Period;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class RetryTlsHandshakeKt {
    public static final Period access$getSelectedPeriod(PeriodSelectionViewModel.ContentModel contentModel) {
        for (Period period : contentModel.periods) {
            if (Intrinsics.areEqual(period.token, contentModel.selectedPeriodToken)) {
                return period;
            }
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
        return null;
    }

    public static final Bitmap drawableToBitmap(Drawable drawable, int i, int i2) {
        drawable.getClass();
        if (i == 0 || i2 == 0) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap().getWidth() == i && bitmapDrawable.getBitmap().getHeight() == i2) {
                return bitmapDrawable.getBitmap();
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(new Rect(0, 0, i, i2));
        drawable.draw(canvas);
        return createBitmap;
    }

    public static final boolean retryTlsHandshake(IOException iOException) {
        if ((iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }
}
