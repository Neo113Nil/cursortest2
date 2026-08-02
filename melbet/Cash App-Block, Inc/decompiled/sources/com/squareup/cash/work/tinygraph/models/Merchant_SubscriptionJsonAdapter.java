package com.squareup.cash.work.tinygraph.models;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/Merchant_SubscriptionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/cash/work/tinygraph/models/Merchant$Subscription;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Merchant_SubscriptionJsonAdapter extends JsonAdapter {
    public volatile Constructor constructorRef;
    public final JsonAdapter nullableBooleanAdapter;
    public final JsonReader.Options options;

    public Merchant_SubscriptionJsonAdapter(Moshi moshi) {
        moshi.getClass();
        this.options = JsonReader.Options.of("isEnabled", "canRequestTimeOff", "canUseAvailability", "canEnforceEarlyTimecardActions", "canUseAutoClockout", "canUseGeofencing", "canUseMessages", "canUseAnnouncements", "canUseTeamFiles", "canUseDocumentStorage", "canUseTeamMemberOnboarding");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, EmptySet.INSTANCE, "isEnabled");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        jsonReader.getClass();
        jsonReader.beginObject();
        int i = -1;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        Boolean bool10 = null;
        Boolean bool11 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -2;
                    break;
                case 1:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    bool5 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    bool6 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    bool7 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    bool8 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -129;
                    break;
                case 8:
                    bool9 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -257;
                    break;
                case 9:
                    bool10 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -513;
                    break;
                case 10:
                    bool11 = (Boolean) this.nullableBooleanAdapter.fromJson(jsonReader);
                    i &= -1025;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -2048) {
            Boolean bool12 = bool9;
            Boolean bool13 = bool8;
            Boolean bool14 = bool7;
            Boolean bool15 = bool6;
            Boolean bool16 = bool5;
            Boolean bool17 = bool4;
            return new Merchant.Subscription(bool, bool2, bool3, bool17, bool16, bool15, bool14, bool13, bool12, bool10, bool11);
        }
        Boolean bool18 = bool9;
        Boolean bool19 = bool8;
        Boolean bool20 = bool7;
        Boolean bool21 = bool6;
        Boolean bool22 = bool5;
        Boolean bool23 = bool4;
        Boolean bool24 = bool3;
        Boolean bool25 = bool2;
        Boolean bool26 = bool;
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Merchant.Subscription.class.getDeclaredConstructor(Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            constructor.getClass();
        }
        Object newInstance = constructor.newInstance(bool26, bool25, bool24, bool23, bool22, bool21, bool20, bool19, bool18, bool10, bool11, Integer.valueOf(i), null);
        newInstance.getClass();
        return (Merchant.Subscription) newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        Merchant.Subscription subscription = (Merchant.Subscription) obj;
        jsonWriter.getClass();
        if (subscription == null) {
            a$$ExternalSyntheticBUOutline0.m$2("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("isEnabled");
        Boolean bool = subscription.isEnabled;
        JsonAdapter jsonAdapter = this.nullableBooleanAdapter;
        jsonAdapter.toJson(jsonWriter, bool);
        jsonWriter.name("canRequestTimeOff");
        jsonAdapter.toJson(jsonWriter, subscription.canRequestTimeOff);
        jsonWriter.name("canUseAvailability");
        jsonAdapter.toJson(jsonWriter, subscription.canUseAvailability);
        jsonWriter.name("canEnforceEarlyTimecardActions");
        jsonAdapter.toJson(jsonWriter, subscription.canEnforceEarlyTimecardActions);
        jsonWriter.name("canUseAutoClockout");
        jsonAdapter.toJson(jsonWriter, subscription.canUseAutoClockout);
        jsonWriter.name("canUseGeofencing");
        jsonAdapter.toJson(jsonWriter, subscription.canUseGeofencing);
        jsonWriter.name("canUseMessages");
        jsonAdapter.toJson(jsonWriter, subscription.canUseMessages);
        jsonWriter.name("canUseAnnouncements");
        jsonAdapter.toJson(jsonWriter, subscription.canUseAnnouncements);
        jsonWriter.name("canUseTeamFiles");
        jsonAdapter.toJson(jsonWriter, subscription.canUseTeamFiles);
        jsonWriter.name("canUseDocumentStorage");
        jsonAdapter.toJson(jsonWriter, subscription.canUseDocumentStorage);
        jsonWriter.name("canUseTeamMemberOnboarding");
        jsonAdapter.toJson(jsonWriter, subscription.canUseTeamMemberOnboarding);
        jsonWriter.endObject();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(43, "GeneratedJsonAdapter(Merchant.Subscription)");
    }
}
