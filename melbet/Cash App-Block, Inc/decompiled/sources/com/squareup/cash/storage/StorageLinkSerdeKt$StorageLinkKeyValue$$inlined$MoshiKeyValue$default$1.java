package com.squareup.cash.storage;

import com.squareup.moshi.JsonAdapter;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$1 implements Function1 {
    public final /* synthetic */ JsonAdapter $adapter;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$1(JsonAdapter jsonAdapter, int i) {
        this.$r8$classId = i;
        this.$adapter = jsonAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        JsonAdapter jsonAdapter = this.$adapter;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Object fromJson = jsonAdapter.fromJson(str);
                fromJson.getClass();
                return fromJson;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                Object fromJson2 = jsonAdapter.fromJson(str2);
                fromJson2.getClass();
                return fromJson2;
            case 2:
                obj.getClass();
                String json = jsonAdapter.toJson(obj);
                json.getClass();
                return json;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                Object fromJson3 = jsonAdapter.fromJson(str3);
                fromJson3.getClass();
                return fromJson3;
            case 4:
                obj.getClass();
                String json2 = jsonAdapter.toJson(obj);
                json2.getClass();
                return json2;
            case 5:
                String str4 = (String) obj;
                str4.getClass();
                Object fromJson4 = jsonAdapter.fromJson(str4);
                fromJson4.getClass();
                return fromJson4;
            case 6:
                obj.getClass();
                String json3 = jsonAdapter.toJson(obj);
                json3.getClass();
                return json3;
            case 7:
                String str5 = (String) obj;
                str5.getClass();
                Object fromJson5 = jsonAdapter.fromJson(str5);
                fromJson5.getClass();
                return fromJson5;
            case 8:
                obj.getClass();
                String json4 = jsonAdapter.toJson(obj);
                json4.getClass();
                return json4;
            case 9:
                obj.getClass();
                String json5 = jsonAdapter.toJson(obj);
                json5.getClass();
                return json5;
            case 10:
                String str6 = (String) obj;
                str6.getClass();
                Object fromJson6 = jsonAdapter.fromJson(str6);
                fromJson6.getClass();
                return fromJson6;
            default:
                obj.getClass();
                String json6 = jsonAdapter.toJson(obj);
                json6.getClass();
                return json6;
        }
    }
}
