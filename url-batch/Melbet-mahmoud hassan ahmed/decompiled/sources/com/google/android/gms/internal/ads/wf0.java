package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class wf0 extends eg0 {

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f13807c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f13808d;

    /* renamed from: e, reason: collision with root package name */
    private final String f13809e;

    /* renamed from: f, reason: collision with root package name */
    private final long f13810f;

    /* renamed from: g, reason: collision with root package name */
    private final long f13811g;

    /* renamed from: h, reason: collision with root package name */
    private final String f13812h;

    /* renamed from: i, reason: collision with root package name */
    private final String f13813i;

    public wf0(eu0 eu0Var, Map<String, String> map) {
        super(eu0Var, "createCalendarEvent");
        this.f13807c = map;
        this.f13808d = eu0Var.j();
        this.f13809e = l("description");
        this.f13812h = l("summary");
        this.f13810f = k("start_ticks");
        this.f13811g = k("end_ticks");
        this.f13813i = l("location");
    }

    private final long k(String str) {
        String str2 = this.f13807c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String l(String str) {
        return TextUtils.isEmpty(this.f13807c.get(str)) ? "" : this.f13807c.get(str);
    }

    @TargetApi(14)
    final Intent i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f13809e);
        data.putExtra("eventLocation", this.f13813i);
        data.putExtra("description", this.f13812h);
        long j7 = this.f13810f;
        if (j7 > -1) {
            data.putExtra("beginTime", j7);
        }
        long j8 = this.f13811g;
        if (j8 > -1) {
            data.putExtra("endTime", j8);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void j() {
        if (this.f13808d == null) {
            c("Activity context is not available.");
            return;
        }
        y2.t.q();
        if (!new v00(this.f13808d).b()) {
            c("This feature is not available on the device.");
            return;
        }
        y2.t.q();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f13808d);
        Resources d7 = y2.t.p().d();
        builder.setTitle(d7 != null ? d7.getString(w2.b.f23011l) : "Create calendar event");
        builder.setMessage(d7 != null ? d7.getString(w2.b.f23012m) : "Allow Ad to create a calendar event?");
        builder.setPositiveButton(d7 != null ? d7.getString(w2.b.f23009j) : "Accept", new uf0(this));
        builder.setNegativeButton(d7 != null ? d7.getString(w2.b.f23010k) : "Decline", new vf0(this));
        builder.create().show();
    }
}
