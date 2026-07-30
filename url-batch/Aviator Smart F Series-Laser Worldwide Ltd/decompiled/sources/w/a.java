package w;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.h;
import com.airbnb.lottie.utils.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {
    private final AssetManager assetManager;

    @Nullable
    private com.airbnb.lottie.a delegate;
    private final h tempPair = new h();
    private final Map<h, Typeface> fontMap = new HashMap();
    private final Map<String, Typeface> fontFamilies = new HashMap();
    private String defaultFontFileExtension = ".ttf";

    public a(Drawable.Callback callback, @Nullable com.airbnb.lottie.a aVar) {
        this.delegate = aVar;
        if (callback instanceof View) {
            this.assetManager = ((View) callback).getContext().getAssets();
        } else {
            f.warning("LottieDrawable must be inside of a view for images to work.");
            this.assetManager = null;
        }
    }

    private Typeface getFontFamily(String str) {
        String fontPath;
        Typeface typeface = this.fontFamilies.get(str);
        if (typeface != null) {
            return typeface;
        }
        com.airbnb.lottie.a aVar = this.delegate;
        Typeface fetchFont = aVar != null ? aVar.fetchFont(str) : null;
        com.airbnb.lottie.a aVar2 = this.delegate;
        if (aVar2 != null && fetchFont == null && (fontPath = aVar2.getFontPath(str)) != null) {
            fetchFont = Typeface.createFromAsset(this.assetManager, fontPath);
        }
        if (fetchFont == null) {
            fetchFont = Typeface.createFromAsset(this.assetManager, "fonts/" + str + this.defaultFontFileExtension);
        }
        this.fontFamilies.put(str, fetchFont);
        return fetchFont;
    }

    private Typeface typefaceForStyle(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i8 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i8 ? typeface : Typeface.create(typeface, i8);
    }

    public Typeface getTypeface(String str, String str2) {
        this.tempPair.set(str, str2);
        Typeface typeface = this.fontMap.get(this.tempPair);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceForStyle = typefaceForStyle(getFontFamily(str), str2);
        this.fontMap.put(this.tempPair, typefaceForStyle);
        return typefaceForStyle;
    }

    public void setDefaultFontFileExtension(String str) {
        this.defaultFontFileExtension = str;
    }

    public void setDelegate(@Nullable com.airbnb.lottie.a aVar) {
        this.delegate = aVar;
    }
}
