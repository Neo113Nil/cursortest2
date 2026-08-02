package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.rf;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class AdInformationConfig implements Serializable {
    private static final String DEFAULT_DIALOG_URL = "https://funnel-assets.startappservice.com/consent/index.html";
    protected static final boolean DEFAULT_EANBLED = true;
    private static final String DEFAULT_EULA_URL = "https://www.startapp.com/policy/privacy-policy/";
    private static final float DEFAULT_FAT_FINGERS_FACTOR = 200.0f;
    private static final long serialVersionUID = 8911501868319500986L;
    private Integer consentTypeInfo;
    private boolean enabled = true;
    private float fatFingersFactor = DEFAULT_FAT_FINGERS_FACTOR;
    private String dialogUrlSecured = DEFAULT_DIALOG_URL;
    private String eulaUrlSecured = DEFAULT_EULA_URL;

    @TypeInfo(key = AdPreferences.Placement.class, type = HashMap.class, value = AdInformationPositions.Position.class)
    protected HashMap<AdPreferences.Placement, AdInformationPositions.Position> Positions = new HashMap<>();
    private transient EnumMap<ImageResourceType, ImageResourceConfig> imageResources = new EnumMap<>(ImageResourceType.class);

    @TypeInfo(type = ArrayList.class, value = ImageResourceConfig.class)
    private List<ImageResourceConfig> ImageResources = new ArrayList();

    public enum ImageResourceType {
        INFO_S(17, 14),
        INFO_L(25, 21);

        private final int height;
        private final int width;

        ImageResourceType(int i4, int i5) {
            this.width = i4;
            this.height = i5;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdInformationConfig adInformationConfig = (AdInformationConfig) obj;
            if (this.enabled == adInformationConfig.enabled && Float.compare(adInformationConfig.fatFingersFactor, this.fatFingersFactor) == 0 && si.a((Object) this.consentTypeInfo, (Object) adInformationConfig.consentTypeInfo) && si.a((Object) this.dialogUrlSecured, (Object) adInformationConfig.dialogUrlSecured) && si.a((Object) this.eulaUrlSecured, (Object) adInformationConfig.eulaUrlSecured) && si.a((Object) this.Positions, (Object) adInformationConfig.Positions) && si.a(this.ImageResources, adInformationConfig.ImageResources)) {
                return true;
            }
        }
        return false;
    }

    public Integer getConsentTypeInfo() {
        return this.consentTypeInfo;
    }

    public String getDialogUrl() {
        String str = this.dialogUrlSecured;
        return str != null ? str : DEFAULT_DIALOG_URL;
    }

    public String getEulaUrl() {
        String str = this.eulaUrlSecured;
        return (str == null || str.equals("")) ? DEFAULT_EULA_URL : this.eulaUrlSecured;
    }

    public float getFatFingerFactor() {
        return this.fatFingersFactor / 100.0f;
    }

    public int getHeight(ImageResourceType imageResourceType) {
        ImageResourceConfig imageResourceConfig = this.imageResources.get(imageResourceType);
        return imageResourceConfig != null ? imageResourceConfig.a() : imageResourceType.height;
    }

    public Drawable getImage(Context context, ImageResourceType imageResourceType) {
        ImageResourceConfig imageResourceConfig = this.imageResources.get(imageResourceType);
        return imageResourceConfig != null ? imageResourceConfig.b(context) : ImageResourceConfig.a(context);
    }

    public AdInformationPositions.Position getPosition(AdPreferences.Placement placement) {
        AdInformationPositions.Position position = this.Positions.get(placement);
        if (position != null) {
            return position;
        }
        AdInformationPositions.Position position2 = AdInformationPositions.Position.BOTTOM_LEFT;
        this.Positions.put(placement, position2);
        return position2;
    }

    public Drawable getPrivacyIcon(Context context) {
        ImageResourceConfig imageResourceConfig = this.imageResources.get(ImageResourceType.INFO_L);
        return imageResourceConfig != null ? imageResourceConfig.b(context) : ImageResourceConfig.a(context);
    }

    public String getPrivacyIconUrl() {
        ImageResourceConfig imageResourceConfig = this.imageResources.get(ImageResourceType.INFO_L);
        if (imageResourceConfig != null) {
            return imageResourceConfig.b();
        }
        return null;
    }

    public int getWidth(ImageResourceType imageResourceType) {
        ImageResourceConfig imageResourceConfig = this.imageResources.get(imageResourceType);
        return imageResourceConfig != null ? imageResourceConfig.d() : imageResourceType.width;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.consentTypeInfo, Float.valueOf(this.fatFingersFactor), this.dialogUrlSecured, this.eulaUrlSecured, this.Positions, this.ImageResources};
        WeakHashMap weakHashMap = si.f7575a;
        return Arrays.deepHashCode(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0006 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void initImageResourceConfigBitmaps(Context context) {
        ImageResourceType imageResourceType;
        for (ImageResourceConfig imageResourceConfig : this.ImageResources) {
            String c4 = imageResourceConfig.c();
            if (c4 != null) {
                switch (c4) {
                    case "INFO_L":
                    case "info_l":
                        imageResourceType = ImageResourceType.INFO_L;
                        break;
                    case "INFO_S":
                    case "info_s":
                        imageResourceType = ImageResourceType.INFO_S;
                        break;
                }
                if (imageResourceType == null) {
                    setImageResourceConfig(imageResourceType, imageResourceConfig);
                    imageResourceConfig.c(context);
                }
            }
            imageResourceType = null;
            if (imageResourceType == null) {
            }
        }
    }

    public void initTransientFields() {
        this.imageResources = new EnumMap<>(ImageResourceType.class);
    }

    public boolean isEnabled(Context context) {
        return !((sf) com.startapp.sdk.components.a.a(context).f6547G.a()).getBoolean("userDisabledAdInformation", false) && isMetaDataEnabled();
    }

    public boolean isMetaDataEnabled() {
        return this.enabled;
    }

    public void setImageResourceConfig(ImageResourceType imageResourceType, ImageResourceConfig imageResourceConfig) {
        this.imageResources.put((EnumMap<ImageResourceType, ImageResourceConfig>) imageResourceType, (ImageResourceType) imageResourceConfig);
    }

    public void setUserEnabled(Context context, boolean z) {
        rf edit = ((sf) com.startapp.sdk.components.a.a(context).f6547G.a()).edit();
        boolean z4 = !z;
        edit.a("userDisabledAdInformation", Boolean.valueOf(z4));
        edit.f7532a.putBoolean("userDisabledAdInformation", z4);
        edit.apply();
    }
}
