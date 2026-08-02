package sqip.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.Card$Brand;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000\u001a\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\f\u0010\u0011\u001a\u00020\u0001*\u00020\u0012H\u0000\u001a\u0014\u0010\u0013\u001a\u00020\f*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0015\u001a\u00020\f*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0016\u001a\u00020\u000e*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0000\u001a\f\u0010\u0019\u001a\u00020\u000e*\u00020\u0017H\u0000\u001a\f\u0010\u001a\u001a\u00020\u000e*\u00020\u0017H\u0000\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001dH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"OVERRIDE_MAX_LENGTH", "", "nonDigitPattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "spacePattern", "applySafeToDrawInsets", "", "rootView", "Landroid/view/View;", "statusBarView", "isLaunchedFrom", "", "className", "", "clazz", "", "getMaxCvvLength", "Lcom/squareup/Card$Brand;", "isGiftCardMaxLength", "length", "isMobileCommerceMaxLength", "removePattern", "", "pattern", "stripNonDigits", "stripSpaces", "toBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "card-entry_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UtilsKt {
    private static final int OVERRIDE_MAX_LENGTH = 16;
    private static final Pattern nonDigitPattern = Pattern.compile("[^0-9]");
    private static final Pattern spacePattern = Pattern.compile(" ");

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Card$Brand.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void applySafeToDrawInsets(View view, View view2) {
        view.getClass();
        view2.getClass();
        UtilsKt$$ExternalSyntheticLambda0 utilsKt$$ExternalSyntheticLambda0 = new UtilsKt$$ExternalSyntheticLambda0(view2);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view, utilsKt$$ExternalSyntheticLambda0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat applySafeToDrawInsets$lambda$2(View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        view2.getClass();
        windowInsetsCompat.getClass();
        Insets insets = windowInsetsCompat.mImpl.getInsets(655);
        insets.getClass();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = insets.left;
        marginLayoutParams.bottomMargin = insets.bottom;
        marginLayoutParams.rightMargin = insets.right;
        view2.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return null;
        }
        layoutParams2.height = insets.top;
        view.setLayoutParams(layoutParams2);
        return WindowInsetsCompat.CONSUMED;
    }

    public static final int getMaxCvvLength(Card$Brand card$Brand) {
        card$Brand.getClass();
        if (card$Brand == Card$Brand.UNKNOWN) {
            return 4;
        }
        return card$Brand.cvvLength();
    }

    public static final boolean isGiftCardMaxLength(Card$Brand card$Brand, int i) {
        card$Brand.getClass();
        return i == 16;
    }

    public static final boolean isLaunchedFrom(String str, Object obj) {
        str.getClass();
        obj.getClass();
        try {
            return Class.forName(str).isInstance(obj);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static final boolean isMobileCommerceMaxLength(Card$Brand card$Brand, int i) {
        card$Brand.getClass();
        int i2 = WhenMappings.$EnumSwitchMapping$0[card$Brand.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return i == 16;
        }
        int[] iArr = card$Brand.validNumberLengths;
        return i == iArr[iArr.length - 1];
    }

    public static final String removePattern(CharSequence charSequence, Pattern pattern) {
        charSequence.getClass();
        pattern.getClass();
        String replaceAll = pattern.matcher(charSequence).replaceAll("");
        replaceAll.getClass();
        return replaceAll;
    }

    public static final String stripNonDigits(CharSequence charSequence) {
        charSequence.getClass();
        Pattern pattern = nonDigitPattern;
        pattern.getClass();
        return removePattern(charSequence, pattern);
    }

    public static final String stripSpaces(CharSequence charSequence) {
        charSequence.getClass();
        Pattern pattern = spacePattern;
        pattern.getClass();
        return removePattern(charSequence, pattern);
    }

    public static final Bitmap toBitmap(Drawable drawable) {
        drawable.getClass();
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }
}
