package com.yandex.div.core.resources;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class ResourcesWrapper extends Resources {

    @NotNull
    private final Resources resources;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourcesWrapper(@NotNull Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // android.content.res.Resources
    public void addLoaders(@NotNull ResourcesLoader... loaders) {
        Intrinsics.checkNotNullParameter(loaders, "loaders");
        this.resources.addLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getAnimation(int i4) {
        XmlResourceParser animation = this.resources.getAnimation(i4);
        Intrinsics.checkNotNullExpressionValue(animation, "resources.getAnimation(id)");
        return animation;
    }

    @Override // android.content.res.Resources
    public int getColor(int i4) {
        return this.resources.getColor(i4);
    }

    @Override // android.content.res.Resources
    @NotNull
    public ColorStateList getColorStateList(int i4, @Nullable Resources.Theme theme) {
        ColorStateList colorStateList = this.resources.getColorStateList(i4, theme);
        Intrinsics.checkNotNullExpressionValue(colorStateList, "resources.getColorStateList(id, theme)");
        return colorStateList;
    }

    @Override // android.content.res.Resources
    @Nullable
    public Configuration getConfiguration() {
        return this.resources.getConfiguration();
    }

    @Override // android.content.res.Resources
    @Nullable
    public DisplayMetrics getDisplayMetrics() {
        return this.resources.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawable(int i4, @Nullable Resources.Theme theme) {
        return this.resources.getDrawable(i4, theme);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawableForDensity(int i4, int i5) {
        return this.resources.getDrawableForDensity(i4, i5);
    }

    @Override // android.content.res.Resources
    public float getFloat(int i4) {
        float f4;
        f4 = this.resources.getFloat(i4);
        return f4;
    }

    @Override // android.content.res.Resources
    @NotNull
    public Typeface getFont(int i4) {
        Typeface font;
        font = this.resources.getFont(i4);
        Intrinsics.checkNotNullExpressionValue(font, "resources.getFont(id)");
        return font;
    }

    @Override // android.content.res.Resources
    public float getFraction(int i4, int i5, int i6) {
        return this.resources.getFraction(i4, i5, i6);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return this.resources.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    @NotNull
    public int[] getIntArray(int i4) {
        int[] intArray = this.resources.getIntArray(i4);
        Intrinsics.checkNotNullExpressionValue(intArray, "resources.getIntArray(id)");
        return intArray;
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getLayout(int i4) {
        XmlResourceParser layout = this.resources.getLayout(i4);
        Intrinsics.checkNotNullExpressionValue(layout, "resources.getLayout(id)");
        return layout;
    }

    @Override // android.content.res.Resources
    @Nullable
    public Movie getMovie(int i4) {
        return this.resources.getMovie(i4);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getQuantityString(int i4, int i5, @NotNull Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        String quantityString = this.resources.getQuantityString(i4, i5, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityStr…d, quantity, *formatArgs)");
        return quantityString;
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence getQuantityText(int i4, int i5) {
        CharSequence quantityText = this.resources.getQuantityText(i4, i5);
        Intrinsics.checkNotNullExpressionValue(quantityText, "resources.getQuantityText(id, quantity)");
        return quantityText;
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceEntryName(int i4) {
        return this.resources.getResourceEntryName(i4);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceName(int i4) {
        return this.resources.getResourceName(i4);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourcePackageName(int i4) {
        return this.resources.getResourcePackageName(i4);
    }

    @Override // android.content.res.Resources
    @Nullable
    public String getResourceTypeName(int i4) {
        return this.resources.getResourceTypeName(i4);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getString(int i4, @NotNull Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        String string = this.resources.getString(i4, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(id, *formatArgs)");
        return string;
    }

    @Override // android.content.res.Resources
    @NotNull
    public String[] getStringArray(int i4) {
        String[] stringArray = this.resources.getStringArray(i4);
        Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray(id)");
        return stringArray;
    }

    @Override // android.content.res.Resources
    @Nullable
    public CharSequence getText(int i4, @Nullable CharSequence charSequence) {
        return this.resources.getText(i4, charSequence);
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence[] getTextArray(int i4) {
        CharSequence[] textArray = this.resources.getTextArray(i4);
        Intrinsics.checkNotNullExpressionValue(textArray, "resources.getTextArray(id)");
        return textArray;
    }

    @Override // android.content.res.Resources
    public void getValue(@Nullable String str, @Nullable TypedValue typedValue, boolean z4) {
        this.resources.getValue(str, typedValue, z4);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i4, int i5, @Nullable TypedValue typedValue, boolean z4) {
        this.resources.getValueForDensity(i4, i5, typedValue, z4);
    }

    @Override // android.content.res.Resources
    @NotNull
    public XmlResourceParser getXml(int i4) {
        XmlResourceParser xml = this.resources.getXml(i4);
        Intrinsics.checkNotNullExpressionValue(xml, "resources.getXml(id)");
        return xml;
    }

    @Override // android.content.res.Resources
    @Nullable
    public TypedArray obtainAttributes(@Nullable AttributeSet attributeSet, @Nullable int[] iArr) {
        return this.resources.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    @NotNull
    public TypedArray obtainTypedArray(int i4) {
        TypedArray obtainTypedArray = this.resources.obtainTypedArray(i4);
        Intrinsics.checkNotNullExpressionValue(obtainTypedArray, "resources.obtainTypedArray(id)");
        return obtainTypedArray;
    }

    @Override // android.content.res.Resources
    @NotNull
    public InputStream openRawResource(int i4, @Nullable TypedValue typedValue) {
        InputStream openRawResource = this.resources.openRawResource(i4, typedValue);
        Intrinsics.checkNotNullExpressionValue(openRawResource, "resources.openRawResource(id, value)");
        return openRawResource;
    }

    @Override // android.content.res.Resources
    @Nullable
    public AssetFileDescriptor openRawResourceFd(int i4) {
        return this.resources.openRawResourceFd(i4);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(@Nullable String str, @Nullable AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.resources.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(@Nullable XmlResourceParser xmlResourceParser, @Nullable Bundle bundle) {
        this.resources.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void removeLoaders(@NotNull ResourcesLoader... loaders) {
        Intrinsics.checkNotNullParameter(loaders, "loaders");
        this.resources.removeLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(@Nullable Configuration configuration, @Nullable DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.resources;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public int getColor(int i4, @Nullable Resources.Theme theme) {
        return this.resources.getColor(i4, theme);
    }

    @Override // android.content.res.Resources
    @NotNull
    public ColorStateList getColorStateList(int i4) {
        ColorStateList colorStateList = this.resources.getColorStateList(i4);
        Intrinsics.checkNotNullExpressionValue(colorStateList, "resources.getColorStateList(id)");
        return colorStateList;
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawable(int i4) {
        return this.resources.getDrawable(i4);
    }

    @Override // android.content.res.Resources
    @Nullable
    public Drawable getDrawableForDensity(int i4, int i5, @Nullable Resources.Theme theme) {
        return this.resources.getDrawableForDensity(i4, i5, theme);
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getQuantityString(int i4, int i5) {
        String quantityString = this.resources.getQuantityString(i4, i5);
        Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityString(id, quantity)");
        return quantityString;
    }

    @Override // android.content.res.Resources
    @NotNull
    public String getString(int i4) {
        String string = this.resources.getString(i4);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(id)");
        return string;
    }

    @Override // android.content.res.Resources
    @NotNull
    public CharSequence getText(int i4) {
        CharSequence text = this.resources.getText(i4);
        Intrinsics.checkNotNullExpressionValue(text, "resources.getText(id)");
        return text;
    }

    @Override // android.content.res.Resources
    public void getValue(int i4, @Nullable TypedValue typedValue, boolean z4) {
        this.resources.getValue(i4, typedValue, z4);
    }

    @Override // android.content.res.Resources
    @NotNull
    public InputStream openRawResource(int i4) {
        InputStream openRawResource = this.resources.openRawResource(i4);
        Intrinsics.checkNotNullExpressionValue(openRawResource, "resources.openRawResource(id)");
        return openRawResource;
    }
}
