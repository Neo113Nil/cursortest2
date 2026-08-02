package com.squareup.wire;

import android.net.Uri;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.ImagesKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import designsystem.arcade.ArcadeColors;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class GrpcStatus implements Serializable {
    public static final List INSTANCES;
    public final int code;
    public final String name;

    /* loaded from: classes5.dex */
    public abstract class Companion {
        public static ViewEvent.Viewport fromJsonObject(JsonObject jsonObject) {
            try {
                Number asNumber = jsonObject.get("width").getAsNumber();
                Number asNumber2 = jsonObject.get("height").getAsNumber();
                asNumber.getClass();
                asNumber2.getClass();
                return new ViewEvent.Viewport(asNumber, asNumber2);
            } catch (IllegalStateException e) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Viewport", e);
                return null;
            } catch (NullPointerException e2) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Viewport", e2);
                return null;
            } catch (NumberFormatException e3) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Viewport", e3);
                return null;
            }
        }

        public static GrpcStatus get(int i) {
            GrpcStatus grpcStatus = (GrpcStatus) CollectionsKt.getOrNull(i, GrpcStatus.INSTANCES);
            return grpcStatus == null ? new GrpcStatus(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "STATUS_"), i) : grpcStatus;
        }

        public static final Image getImage(AvatarViewModel avatarViewModel) {
            Uri uri;
            String uri2;
            avatarViewModel.getClass();
            Image image = avatarViewModel.photoImage;
            if (image != null) {
                return image;
            }
            String str = avatarViewModel.lookupKey;
            String str2 = avatarViewModel.email;
            String str3 = avatarViewModel.sms;
            if ((str == null || StringsKt.isBlank(str)) && ((str2 == null || StringsKt.isBlank(str2)) && (str3 == null || StringsKt.isBlank(str3)))) {
                uri = null;
            } else {
                Uri.Builder builder = new Uri.Builder();
                builder.scheme("contact");
                if (str != null && !StringsKt.isBlank(str)) {
                    builder.appendQueryParameter("recipient_id", str);
                }
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    builder.appendQueryParameter("email", str2);
                }
                if (str3 != null && !StringsKt.isBlank(str3)) {
                    builder.appendQueryParameter("sms", str3);
                }
                uri = builder.build();
            }
            if (uri == null || (uri2 = uri.toString()) == null) {
                return null;
            }
            return ImagesKt.toImage(uri2);
        }

        public static final Character monogram(String str) {
            char charAt = (str == null || StringsKt.isBlank(str)) ? (char) 0 : str.charAt(0);
            if (!Character.isLetter(charAt)) {
                return null;
            }
            Locale locale = Locale.US;
            locale.getClass();
            String valueOf = String.valueOf(charAt);
            valueOf.getClass();
            String upperCase = valueOf.toUpperCase(locale);
            upperCase.getClass();
            return Character.valueOf(upperCase.charAt(0));
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final StackedAvatarViewModel.Avatar toStackedAvatar(AvatarViewModel avatarViewModel) {
            Character ch;
            Character monogram;
            avatarViewModel.getClass();
            ColorModel model$default = avatarViewModel.colorizeAvatar ? MoshiJsonIntegration.toModel$default(ArcadeColors.IconInverse) : null;
            ColorModel colorModel = avatarViewModel.fillBackground ? avatarViewModel.accentColor : null;
            ColorModel colorModel2 = avatarViewModel.accentColor;
            String str = avatarViewModel.avatarMonogramSource;
            if (str == null || (monogram = monogram(str)) == null) {
                String str2 = avatarViewModel.displayName;
                if (str2 == null) {
                    ch = null;
                    String str3 = avatarViewModel.displayName;
                    Image image = getImage(avatarViewModel);
                    Integer num = avatarViewModel.photoRes;
                    return new StackedAvatarViewModel.Avatar(colorModel2, ch, str3, image, num != null ? new StackedAvatarViewModel.Avatar.AvatarDrawableRes(num.intValue(), true, 0) : null, model$default, colorModel, avatarViewModel.isFavorite, avatarViewModel.isSponsorAllowlisted, false, 3104);
                }
                monogram = monogram(str2);
            }
            ch = monogram;
            String str32 = avatarViewModel.displayName;
            Image image2 = getImage(avatarViewModel);
            Integer num2 = avatarViewModel.photoRes;
            return new StackedAvatarViewModel.Avatar(colorModel2, ch, str32, image2, num2 != null ? new StackedAvatarViewModel.Avatar.AvatarDrawableRes(num2.intValue(), true, 0) : null, model$default, colorModel, avatarViewModel.isFavorite, avatarViewModel.isSponsorAllowlisted, false, 3104);
        }
    }

    static {
        int i = 0;
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new GrpcStatus[]{new GrpcStatus("OK", 0), new GrpcStatus("CANCELLED", 1), new GrpcStatus("UNKNOWN", 2), new GrpcStatus("INVALID_ARGUMENT", 3), new GrpcStatus("DEADLINE_EXCEEDED", 4), new GrpcStatus("NOT_FOUND", 5), new GrpcStatus("ALREADY_EXISTS", 6), new GrpcStatus("PERMISSION_DENIED", 7), new GrpcStatus("RESOURCE_EXHAUSTED", 8), new GrpcStatus("FAILED_PRECONDITION", 9), new GrpcStatus("ABORTED", 10), new GrpcStatus("OUT_OF_RANGE", 11), new GrpcStatus("UNIMPLEMENTED", 12), new GrpcStatus("INTERNAL", 13), new GrpcStatus("UNAVAILABLE", 14), new GrpcStatus("DATA_LOSS", 15), new GrpcStatus("UNAUTHENTICATED", 16)});
        Iterator it = listOf.iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            if (i != ((GrpcStatus) it.next()).code) {
                a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                return;
            }
            i = i2;
        }
        INSTANCES = listOf;
    }

    public GrpcStatus(String str, int i) {
        this.name = str;
        this.code = i;
        if (i >= 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        throw null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GrpcStatus) && ((GrpcStatus) obj).code == this.code;
    }

    public final int hashCode() {
        return this.code;
    }
}
