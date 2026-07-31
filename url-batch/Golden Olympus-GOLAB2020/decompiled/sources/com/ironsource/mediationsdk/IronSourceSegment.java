package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.o9;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class IronSourceSegment {
    public static final String AGE = "age";
    public static final String GENDER = "gen";
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String USER_CREATION_DATE = "ucd";

    /* renamed from: m, reason: collision with root package name */
    private static final String f17254m = "segName";

    /* renamed from: a, reason: collision with root package name */
    private String f17255a;

    /* renamed from: g, reason: collision with root package name */
    private String f17261g;

    /* renamed from: b, reason: collision with root package name */
    private int f17256b = 999999;

    /* renamed from: c, reason: collision with root package name */
    private double f17257c = 999999.99d;

    /* renamed from: d, reason: collision with root package name */
    private final String f17258d = "custom";

    /* renamed from: e, reason: collision with root package name */
    private final int f17259e = 5;

    /* renamed from: f, reason: collision with root package name */
    private int f17260f = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f17262h = -1;

    /* renamed from: i, reason: collision with root package name */
    private AtomicBoolean f17263i = null;

    /* renamed from: j, reason: collision with root package name */
    private double f17264j = -1.0d;

    /* renamed from: k, reason: collision with root package name */
    private long f17265k = 0;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<Pair<String, String>> f17266l = new ArrayList<>();

    private boolean a(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    @Deprecated
    public int getAge() {
        return this.f17260f;
    }

    @Deprecated
    public String getGender() {
        return this.f17261g;
    }

    public double getIapt() {
        return this.f17264j;
    }

    public AtomicBoolean getIsPaying() {
        return this.f17263i;
    }

    public int getLevel() {
        return this.f17262h;
    }

    public ArrayList<Pair<String, String>> getSegmentData() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (this.f17260f != -1) {
            arrayList.add(new Pair<>(AGE, this.f17260f + ""));
        }
        if (!TextUtils.isEmpty(this.f17261g)) {
            arrayList.add(new Pair<>(GENDER, this.f17261g));
        }
        if (this.f17262h != -1) {
            arrayList.add(new Pair<>(LEVEL, this.f17262h + ""));
        }
        if (this.f17263i != null) {
            arrayList.add(new Pair<>(PAYING, this.f17263i + ""));
        }
        if (this.f17264j != -1.0d) {
            arrayList.add(new Pair<>(IAPT, this.f17264j + ""));
        }
        if (this.f17265k != 0) {
            arrayList.add(new Pair<>(USER_CREATION_DATE, this.f17265k + ""));
        }
        if (!TextUtils.isEmpty(this.f17255a)) {
            arrayList.add(new Pair<>(f17254m, this.f17255a));
        }
        arrayList.addAll(this.f17266l);
        return arrayList;
    }

    public String getSegmentName() {
        return this.f17255a;
    }

    public long getUcd() {
        return this.f17265k;
    }

    @Deprecated
    public void setAge(int i4) {
        if (i4 > 0 && i4 <= 199) {
            this.f17260f = i4;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setAge( " + i4 + " ) age must be between 1-199", 2);
    }

    public void setCustom(String str, String str2) {
        try {
            if (a(str) && a(str2) && a(str, 1, 32) && a(str2, 1, 32)) {
                String str3 = "custom_" + str;
                if (this.f17266l.size() >= 5) {
                    this.f17266l.remove(0);
                }
                this.f17266l.add(new Pair<>(str3, str2));
                return;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    @Deprecated
    public void setGender(String str) {
        if (!TextUtils.isEmpty(str) && (StringUtils.toLowerCase(str).equals("male") || StringUtils.toLowerCase(str).equals("female"))) {
            this.f17261g = str;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setGender( " + str + " ) is invalid", 2);
    }

    public void setIAPTotal(double d4) {
        if (d4 > 0.0d && d4 < this.f17257c) {
            this.f17264j = Math.floor(d4 * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setIAPTotal( " + d4 + " ) iapt must be between 0-" + this.f17257c, 2);
    }

    public void setIsPaying(boolean z4) {
        if (this.f17263i == null) {
            this.f17263i = new AtomicBoolean();
        }
        this.f17263i.set(z4);
    }

    public void setLevel(int i4) {
        if (i4 > 0 && i4 < this.f17256b) {
            this.f17262h = i4;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setLevel( " + i4 + " ) level must be between 1-" + this.f17256b, 2);
    }

    public void setSegmentName(String str) {
        if (a(str) && a(str, 1, 32)) {
            this.f17255a = str;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setSegmentName( " + str + " ) segment name must be alphanumeric and 1-32 in length", 2);
    }

    public void setUserCreationDate(long j4) {
        if (j4 > 0) {
            this.f17265k = j4;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setUserCreationDate( " + j4 + " ) is an invalid timestamp", 2);
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        ArrayList<Pair<String, String>> segmentData = getSegmentData();
        int size = segmentData.size();
        int i4 = 0;
        while (i4 < size) {
            Pair<String, String> pair = segmentData.get(i4);
            i4++;
            Pair<String, String> pair2 = pair;
            try {
                jSONObject.put((String) pair2.first, pair2.second);
            } catch (JSONException e4) {
                o9.d().a(e4);
                IronLog.INTERNAL.error("exception " + e4.getMessage());
            }
        }
        return jSONObject;
    }

    private boolean a(String str, int i4, int i5) {
        return str != null && str.length() >= i4 && str.length() <= i5;
    }
}
