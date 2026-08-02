package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class MetaDataStyle implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f3426a = new HashSet(Arrays.asList("BOLD"));

    /* renamed from: b, reason: collision with root package name */
    public static final Integer f3427b = 14;

    /* renamed from: c, reason: collision with root package name */
    public static final Integer f3428c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final HashSet f3429d = new HashSet();
    private static final long serialVersionUID = -8172457405775076403L;
    private String name = "";
    private Integer itemGradientTop = -14014151;
    private Integer itemGradientBottom = -8750199;
    private Integer itemTitleTextSize = 18;
    private Integer itemTitleTextColor = -1;

    @TypeInfo(type = HashSet.class)
    private Set<String> itemTitleTextDecoration = f3426a;
    private Integer itemDescriptionTextSize = f3427b;
    private Integer itemDescriptionTextColor = f3428c;

    @TypeInfo(type = HashSet.class)
    private Set<String> itemDescriptionTextDecoration = f3429d;

    public final Integer a() {
        return this.itemDescriptionTextColor;
    }

    public final Set b() {
        return this.itemDescriptionTextDecoration;
    }

    public final Integer c() {
        return this.itemDescriptionTextSize;
    }

    public final Integer d() {
        return this.itemGradientBottom;
    }

    public final Integer e() {
        return this.itemGradientTop;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MetaDataStyle metaDataStyle = (MetaDataStyle) obj;
            if (si.a((Object) this.name, (Object) metaDataStyle.name) && si.a((Object) this.itemGradientTop, (Object) metaDataStyle.itemGradientTop) && si.a((Object) this.itemGradientBottom, (Object) metaDataStyle.itemGradientBottom) && si.a((Object) this.itemTitleTextSize, (Object) metaDataStyle.itemTitleTextSize) && si.a((Object) this.itemTitleTextColor, (Object) metaDataStyle.itemTitleTextColor) && si.a(this.itemTitleTextDecoration, metaDataStyle.itemTitleTextDecoration) && si.a((Object) this.itemDescriptionTextSize, (Object) metaDataStyle.itemDescriptionTextSize) && si.a((Object) this.itemDescriptionTextColor, (Object) metaDataStyle.itemDescriptionTextColor) && si.a(this.itemDescriptionTextDecoration, metaDataStyle.itemDescriptionTextDecoration)) {
                return true;
            }
        }
        return false;
    }

    public final Integer f() {
        return this.itemTitleTextColor;
    }

    public final Set g() {
        return this.itemTitleTextDecoration;
    }

    public final Integer h() {
        return this.itemTitleTextSize;
    }

    public final int hashCode() {
        Object[] objArr = {this.name, this.itemGradientTop, this.itemGradientBottom, this.itemTitleTextSize, this.itemTitleTextColor, this.itemTitleTextDecoration, this.itemDescriptionTextSize, this.itemDescriptionTextColor, this.itemDescriptionTextDecoration};
        WeakHashMap weakHashMap = si.f4438a;
        return Arrays.deepHashCode(objArr);
    }
}
