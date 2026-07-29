package com.mopub.nativeads;

import android.view.View;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public abstract class BaseNativeAd {
    private NativeEventListener mNativeEventListener;
    private final Set<String> mImpressionTrackers = new HashSet();
    private final Set<String> mClickTrackers = new HashSet();

    public interface NativeEventListener {
        void onAdClicked();

        void onAdImpressed();
    }

    public abstract void clear(View view);

    public abstract void destroy();

    public abstract void prepare(View view);

    protected BaseNativeAd() {
    }

    public void setNativeEventListener(NativeEventListener nativeEventListener) {
        this.mNativeEventListener = nativeEventListener;
    }

    protected final void notifyAdImpressed() {
        if (this.mNativeEventListener != null) {
            this.mNativeEventListener.onAdImpressed();
        }
    }

    protected final void notifyAdClicked() {
        if (this.mNativeEventListener != null) {
            this.mNativeEventListener.onAdClicked();
        }
    }

    protected final void addImpressionTrackers(Object obj) throws ClassCastException {
        if (!(obj instanceof JSONArray)) {
            throw new ClassCastException("Expected impression trackers of type JSONArray.");
        }
        JSONArray jSONArray = (JSONArray) obj;
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                addImpressionTracker(jSONArray.getString(i));
            } catch (JSONException unused) {
                MoPubLog.d("Unable to parse impression trackers.");
            }
        }
    }

    protected final void addClickTrackers(Object obj) throws ClassCastException {
        if (!(obj instanceof JSONArray)) {
            throw new ClassCastException("Expected click trackers of type JSONArray.");
        }
        JSONArray jSONArray = (JSONArray) obj;
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                addClickTracker(jSONArray.getString(i));
            } catch (JSONException unused) {
                MoPubLog.d("Unable to parse click trackers.");
            }
        }
    }

    public final void addImpressionTracker(String str) {
        if (Preconditions.NoThrow.checkNotNull(str, "impressionTracker url is not allowed to be null")) {
            this.mImpressionTrackers.add(str);
        }
    }

    public final void addClickTracker(String str) {
        if (Preconditions.NoThrow.checkNotNull(str, "clickTracker url is not allowed to be null")) {
            this.mClickTrackers.add(str);
        }
    }

    Set<String> getImpressionTrackers() {
        return new HashSet(this.mImpressionTrackers);
    }

    Set<String> getClickTrackers() {
        return new HashSet(this.mClickTrackers);
    }
}
