package com.stripe.android.uicore.image;

import android.graphics.Bitmap;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class LoadedImage {
    public final Bitmap bitmap;
    public final ContentType contentType;

    /* loaded from: classes9.dex */
    public interface ContentType {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Known implements ContentType {
            public static final /* synthetic */ EnumEntriesList $ENTRIES;
            public static final /* synthetic */ Known[] $VALUES;
            public static final Known Jpeg;
            public static final Known Png;
            public static final Known Webp;
            public final String value;

            static {
                Known known = new Known("Jpeg", 0, "image/jpeg");
                Jpeg = known;
                Known known2 = new Known("Png", 1, "image/png");
                Png = known2;
                Known known3 = new Known("Webp", 2, "image/webp");
                Webp = known3;
                Known[] knownArr = {known, known2, known3};
                $VALUES = knownArr;
                $ENTRIES = new EnumEntriesList(knownArr);
            }

            public Known(String str, int i, String str2) {
                this.value = str2;
            }

            public static Known valueOf(String str) {
                return (Known) Enum.valueOf(Known.class, str);
            }

            public static Known[] values() {
                return (Known[]) $VALUES.clone();
            }

            @Override // com.stripe.android.uicore.image.LoadedImage.ContentType
            public final String getValue() {
                return this.value;
            }
        }

        /* loaded from: classes8.dex */
        public final class Unknown implements ContentType {
            public final String value;

            public Unknown(String str) {
                str.getClass();
                this.value = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unknown) && Intrinsics.areEqual(this.value, ((Unknown) obj).value);
            }

            @Override // com.stripe.android.uicore.image.LoadedImage.ContentType
            public final String getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unknown(value=", this.value, ")");
            }
        }

        String getValue();
    }

    public LoadedImage(String str, Bitmap bitmap) {
        Object obj;
        str.getClass();
        Iterator it = ContentType.Known.$ENTRIES.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ContentType.Known) obj).value.equals(str)) {
                    break;
                }
            }
        }
        ContentType contentType = (ContentType.Known) obj;
        this.contentType = contentType == null ? new ContentType.Unknown(str) : contentType;
        this.bitmap = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadedImage)) {
            return false;
        }
        LoadedImage loadedImage = (LoadedImage) obj;
        return Intrinsics.areEqual(this.contentType, loadedImage.contentType) && Intrinsics.areEqual(this.bitmap, loadedImage.bitmap);
    }

    public final int hashCode() {
        return this.bitmap.hashCode() + (this.contentType.hashCode() * 31);
    }

    public final String toString() {
        return "LoadedImage(contentType=" + this.contentType + ", bitmap=" + this.bitmap + ")";
    }
}
