package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class MetaData {

    /* renamed from: a, reason: collision with root package name */
    private String f17671a;

    /* renamed from: b, reason: collision with root package name */
    private List<String> f17672b;

    /* renamed from: c, reason: collision with root package name */
    private List<MetaDataValueTypes> f17673c;

    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list) {
        this.f17671a = str;
        this.f17672b = list;
        this.f17673c = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f17673c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public String getMetaDataKey() {
        return this.f17671a;
    }

    public List<String> getMetaDataValue() {
        return this.f17672b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f17673c;
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f17671a = str;
        this.f17672b = list;
        this.f17673c = list2;
    }
}
