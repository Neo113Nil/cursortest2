package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.o8;
import com.startapp.sdk.internal.z6;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class AdInformationMetaData implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static volatile AdInformationMetaData f121a = new AdInformationMetaData();
    private static final Object b = new Object();
    private static final long serialVersionUID = -6352184674890532240L;

    @TypeInfo(complex = true)
    private AdInformationConfig AdInformation = new AdInformationConfig();
    private String adInformationMetadataUpdateVersion = "5.3.2";

    public static void b(Context context) {
        AdInformationMetaData adInformationMetaData = (AdInformationMetaData) z6.b(context, "StartappAdInfoMetadata");
        AdInformationMetaData adInformationMetaData2 = new AdInformationMetaData();
        if (adInformationMetaData != null) {
            boolean a2 = zh.a((Serializable) adInformationMetaData, (Serializable) adInformationMetaData2);
            if ("5.3.2".equals(adInformationMetaData.adInformationMetadataUpdateVersion) && a2) {
                n8 n8Var = new n8(o8.e);
                n8Var.d = "metadata_null";
                n8Var.a();
            }
            adInformationMetaData.AdInformation.initTransientFields();
            f121a = adInformationMetaData;
        } else {
            f121a = adInformationMetaData2;
        }
        f121a.AdInformation.initImageResourceConfigBitmaps(context);
    }

    public static AdInformationMetaData c() {
        return f121a;
    }

    public final AdInformationConfig a() {
        return this.AdInformation;
    }

    public final String d() {
        return this.AdInformation.getPrivacyIconUrl();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdInformationMetaData adInformationMetaData = (AdInformationMetaData) obj;
            if (zh.a((Object) this.AdInformation, (Object) adInformationMetaData.AdInformation) && zh.a((Object) this.adInformationMetadataUpdateVersion, (Object) adInformationMetaData.adInformationMetadataUpdateVersion)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.AdInformation, this.adInformationMetadataUpdateVersion};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, AdInformationMetaData adInformationMetaData) {
        synchronized (b) {
            adInformationMetaData.adInformationMetadataUpdateVersion = "5.3.2";
            f121a = adInformationMetaData;
            f121a.AdInformation.initImageResourceConfigBitmaps(context);
            z6.b(context, "StartappAdInfoMetadata", adInformationMetaData);
        }
    }

    public final Drawable a(Context context) {
        return this.AdInformation.getPrivacyIcon(context);
    }

    public final String b() {
        return this.AdInformation.getEulaUrl();
    }
}
