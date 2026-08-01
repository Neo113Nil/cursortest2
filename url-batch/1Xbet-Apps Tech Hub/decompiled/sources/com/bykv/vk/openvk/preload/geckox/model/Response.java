package com.bykv.vk.openvk.preload.geckox.model;

import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.a.a.c;

/* loaded from: classes.dex */
public class Response<T> {

    @c(a = "data")
    public T data;

    @c(a = NotificationCompat.CATEGORY_STATUS)
    public int status;
}
