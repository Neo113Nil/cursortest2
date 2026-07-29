package com.youappi.sdk.net.model;

import com.google.gson.a.c;
import com.youappi.sdk.net.model.AdItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ProductItem<T extends AdItem> implements Serializable {

    @c(a = "ads")
    private ArrayList<T> _ads;

    @c(a = "configuration")
    private ConfigurationItem _configuration;

    @c(a = "responseId")
    private String _responseId;

    public ConfigurationItem getConfiguration() {
        return this._configuration;
    }

    public List<T> getProductList() {
        return this._ads;
    }

    public String getResponseId() {
        return this._responseId;
    }
}
