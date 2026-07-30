package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.core.R;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ColorStateListInflaterCompat {
    private static final ThreadLocal<TypedValue> sTempTypedValue = new ThreadLocal<>();

    private ColorStateListInflaterCompat() {
    }

    @NonNull
    public static ColorStateList createFromXml(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return createFromXmlInner(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @NonNull
    public static ColorStateList createFromXmlInner(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return inflate(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @NonNull
    private static TypedValue getTypedValue() {
        ThreadLocal<TypedValue> threadLocal = sTempTypedValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @Nullable
    public static ColorStateList inflate(@NonNull Resources resources, @XmlRes int i8, @Nullable Resources.Theme theme) {
        try {
            return createFromXml(resources, resources.getXml(i8), theme);
        } catch (Exception e8) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e8);
            return null;
        }
    }

    private static boolean isColorInt(@NonNull Resources resources, @ColorRes int i8) {
        TypedValue typedValue = getTypedValue();
        resources.getValue(i8, typedValue, true);
        int i9 = typedValue.type;
        return i9 >= 28 && i9 <= 31;
    }

    @ColorInt
    private static int modulateColorAlpha(@ColorInt int i8, @FloatRange(from = 0.0d, to = 1.0d) float f8, @FloatRange(from = 0.0d, to = 100.0d) float f9) {
        boolean z7 = f9 >= 0.0f && f9 <= 100.0f;
        if (f8 == 1.0f && !z7) {
            return i8;
        }
        int clamp = MathUtils.clamp((int) ((Color.alpha(i8) * f8) + 0.5f), 0, 255);
        if (z7) {
            CamColor fromColor = CamColor.fromColor(i8);
            i8 = CamColor.toColor(fromColor.getHue(), fromColor.getChroma(), f9);
        }
        return (i8 & ViewCompat.MEASURED_SIZE_MASK) | (clamp << 24);
    }

    private static TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ColorStateList inflate(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
        int depth;
        int color;
        float f8;
        int attributeCount;
        int i8;
        Resources resources2 = resources;
        int i9 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[20];
        int i10 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i9 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray obtainAttributes = obtainAttributes(resources2, theme, attributeSet, R.styleable.ColorStateListItem);
                int i11 = R.styleable.ColorStateListItem_android_color;
                int resourceId = obtainAttributes.getResourceId(i11, -1);
                if (resourceId != -1 && !isColorInt(resources2, resourceId)) {
                    try {
                        color = createFromXml(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = obtainAttributes.getColor(R.styleable.ColorStateListItem_android_color, -65281);
                    }
                } else {
                    color = obtainAttributes.getColor(i11, -65281);
                }
                int i12 = R.styleable.ColorStateListItem_android_alpha;
                float f9 = 1.0f;
                if (obtainAttributes.hasValue(i12)) {
                    f9 = obtainAttributes.getFloat(i12, 1.0f);
                } else {
                    int i13 = R.styleable.ColorStateListItem_alpha;
                    if (obtainAttributes.hasValue(i13)) {
                        f9 = obtainAttributes.getFloat(i13, 1.0f);
                    }
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    int i14 = R.styleable.ColorStateListItem_android_lStar;
                    if (obtainAttributes.hasValue(i14)) {
                        f8 = obtainAttributes.getFloat(i14, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr3 = new int[attributeCount];
                        int i15 = 0;
                        for (i8 = 0; i8 < attributeCount; i8++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i8);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i16 = i15 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr3[i15] = attributeNameResource;
                                i15 = i16;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr3, i15);
                        iArr2 = GrowingArrayUtils.append(iArr2, i10, modulateColorAlpha(color, f9, f8));
                        iArr = (int[][]) GrowingArrayUtils.append(iArr, i10, trimStateSet);
                        i10++;
                    }
                }
                f8 = obtainAttributes.getFloat(R.styleable.ColorStateListItem_lStar, -1.0f);
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr32 = new int[attributeCount];
                int i152 = 0;
                while (i8 < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr32, i152);
                iArr2 = GrowingArrayUtils.append(iArr2, i10, modulateColorAlpha(color, f9, f8));
                iArr = (int[][]) GrowingArrayUtils.append(iArr, i10, trimStateSet2);
                i10++;
            }
            i9 = 1;
            resources2 = resources;
        }
        int[] iArr4 = new int[i10];
        int[][] iArr5 = new int[i10][];
        System.arraycopy(iArr2, 0, iArr4, 0, i10);
        System.arraycopy(iArr, 0, iArr5, 0, i10);
        return new ColorStateList(iArr5, iArr4);
    }
}
