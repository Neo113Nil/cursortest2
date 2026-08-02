package com.squareup.protos.cash.marketdata.model;

import android.os.Parcelable;
import com.datadog.android.rum.model.ActionEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzju;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.employeejobs.Job;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class News extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<News> CREATOR;
    public final Action action;
    public final Image avatar;
    public final Long deleted_at;
    public final Long expires_at;
    public final Long id;
    public final String investment_entity_symbol;
    public final String investment_entity_token;
    public final String provider_name;
    public final Long published_at;
    public final String title;

    /* renamed from: type, reason: collision with root package name */
    public final NewsType f1317type;

    /* loaded from: classes4.dex */
    public abstract class Action {

        /* loaded from: classes7.dex */
        public final class DisplayMessageAction extends Action {
            public final com.squareup.protos.cash.marketdata.model.DisplayMessageAction value;

            public DisplayMessageAction(com.squareup.protos.cash.marketdata.model.DisplayMessageAction displayMessageAction) {
                displayMessageAction.getClass();
                this.value = displayMessageAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayMessageAction) && Intrinsics.areEqual(this.value, ((DisplayMessageAction) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "DisplayMessageAction(value=" + this.value + ")";
            }
        }

        /* loaded from: classes7.dex */
        public final class OpenUrlAction extends Action {
            public final com.squareup.protos.cash.marketdata.model.OpenUrlAction value;

            public OpenUrlAction(com.squareup.protos.cash.marketdata.model.OpenUrlAction openUrlAction) {
                openUrlAction.getClass();
                this.value = openUrlAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrlAction) && Intrinsics.areEqual(this.value, ((OpenUrlAction) obj).value);
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "OpenUrlAction(value=" + this.value + ")";
            }
        }

        public static ActionEvent.Display fromJsonObject(JsonObject jsonObject) {
            JsonObject asJsonObject;
            try {
                JsonElement jsonElement = jsonObject.get("viewport");
                return new ActionEvent.Display((jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null) ? null : zzju.fromJsonObject(asJsonObject));
            } catch (IllegalStateException e) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Display", e);
                return null;
            } catch (NullPointerException e2) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Display", e2);
                return null;
            } catch (NumberFormatException e3) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Display", e3);
                return null;
            }
        }

        public static EmptyList getDeepLinkSpecs() {
            return ClientRoute.ViewPayProfile.deepLinkSpecs;
        }
    }

    static {
        News$Companion$ADAPTER$1 news$Companion$ADAPTER$1 = new News$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(News.class), "type.googleapis.com/squareup.cash.marketdata.model.News", Syntax.PROTO_2, null, "squareup/cash/marketdata/model/news.proto");
        ADAPTER = news$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(news$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public News(Long l, String str, String str2, Image image, Action action, Long l2, String str3, String str4, NewsType newsType, Long l3, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.published_at = l;
        this.title = str;
        this.provider_name = str2;
        this.avatar = image;
        this.action = action;
        this.deleted_at = l2;
        this.investment_entity_token = str3;
        this.investment_entity_symbol = str4;
        this.f1317type = newsType;
        this.id = l3;
        this.expires_at = l4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof News)) {
            return false;
        }
        News news = (News) obj;
        return Intrinsics.areEqual(unknownFields(), news.unknownFields()) && Intrinsics.areEqual(this.published_at, news.published_at) && Intrinsics.areEqual(this.title, news.title) && Intrinsics.areEqual(this.provider_name, news.provider_name) && Intrinsics.areEqual(this.avatar, news.avatar) && Intrinsics.areEqual(this.action, news.action) && Intrinsics.areEqual(this.deleted_at, news.deleted_at) && Intrinsics.areEqual(this.investment_entity_token, news.investment_entity_token) && Intrinsics.areEqual(this.investment_entity_symbol, news.investment_entity_symbol) && this.f1317type == news.f1317type && Intrinsics.areEqual(this.id, news.id) && Intrinsics.areEqual(this.expires_at, news.expires_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.published_at;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.provider_name;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Image image = this.avatar;
        int hashCode5 = (hashCode4 + (image != null ? image.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode6 = (hashCode5 + (action != null ? action.hashCode() : 0)) * 37;
        Long l2 = this.deleted_at;
        int hashCode7 = (hashCode6 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str3 = this.investment_entity_token;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.investment_entity_symbol;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        NewsType newsType = this.f1317type;
        int hashCode10 = (hashCode9 + (newsType != null ? newsType.hashCode() : 0)) * 37;
        Long l3 = this.id;
        int hashCode11 = (hashCode10 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.expires_at;
        int hashCode12 = hashCode11 + (l4 != null ? Long.hashCode(l4.longValue()) : 0);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Job.Builder builder = new Job.Builder(10);
        builder.created_at_timestamp_ms = this.published_at;
        builder.token = this.title;
        builder.merchant_token = this.provider_name;
        builder.default_wage = this.avatar;
        builder.version = this.action;
        builder.updated_at_timestamp_ms = this.deleted_at;
        builder.title = this.investment_entity_token;
        builder.tip_eligible = this.investment_entity_symbol;
        builder.default_color_scheme = this.f1317type;
        builder.deleted_at_timestamp_ms = this.id;
        builder.team_member_count = this.expires_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.published_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("published_at=", l, arrayList);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.provider_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "provider_name=", arrayList);
        }
        Image image = this.avatar;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("avatar=", image, arrayList);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        Long l2 = this.deleted_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("deleted_at=", l2, arrayList);
        }
        String str3 = this.investment_entity_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "investment_entity_token=", arrayList);
        }
        String str4 = this.investment_entity_symbol;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "investment_entity_symbol=", arrayList);
        }
        NewsType newsType = this.f1317type;
        if (newsType != null) {
            arrayList.add("type=" + newsType);
        }
        Long l3 = this.id;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("id=", l3, arrayList);
        }
        Long l4 = this.expires_at;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "News{", "}", 0, null, null, 56);
    }
}
