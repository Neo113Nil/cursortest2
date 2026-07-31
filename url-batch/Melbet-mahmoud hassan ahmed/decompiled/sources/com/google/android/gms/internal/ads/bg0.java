package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Map;

/* loaded from: classes.dex */
public final class bg0 extends eg0 {

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f3417c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f3418d;

    public bg0(eu0 eu0Var, Map<String, String> map) {
        super(eu0Var, "storePicture");
        this.f3417c = map;
        this.f3418d = eu0Var.j();
    }

    public final void i() {
        if (this.f3418d == null) {
            c("Activity context is not available");
            return;
        }
        y2.t.q();
        if (!new v00(this.f3418d).c()) {
            c("Feature is not supported by the device.");
            return;
        }
        String str = this.f3417c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            c("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            String valueOf = String.valueOf(str);
            c(valueOf.length() != 0 ? "Invalid image url: ".concat(valueOf) : new String("Invalid image url: "));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        y2.t.q();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            String valueOf2 = String.valueOf(lastPathSegment);
            c(valueOf2.length() != 0 ? "Image type not recognized: ".concat(valueOf2) : new String("Image type not recognized: "));
            return;
        }
        Resources d7 = y2.t.p().d();
        y2.t.q();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f3418d);
        builder.setTitle(d7 != null ? d7.getString(w2.b.f23007h) : "Save image");
        builder.setMessage(d7 != null ? d7.getString(w2.b.f23008i) : "Allow Ad to store image in Picture gallery?");
        builder.setPositiveButton(d7 != null ? d7.getString(w2.b.f23009j) : "Accept", new zf0(this, str, lastPathSegment));
        builder.setNegativeButton(d7 != null ? d7.getString(w2.b.f23010k) : "Decline", new ag0(this));
        builder.create().show();
    }
}
