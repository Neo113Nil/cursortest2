package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class GraphRequestAsyncTask extends AsyncTask<Void, Void, List<? extends GraphResponse>> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = GraphRequestAsyncTask.class.getCanonicalName();
    private final HttpURLConnection connection;
    private Exception exception;
    private final GraphRequestBatch requests;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(GraphRequest... graphRequestArr) {
        this((HttpURLConnection) null, new GraphRequestBatch((GraphRequest[]) Arrays.copyOf(graphRequestArr, graphRequestArr.length)));
        graphRequestArr.getClass();
    }

    /* renamed from: doInBackground, reason: avoid collision after fix types in other method */
    public List<GraphResponse> doInBackground2(Void... voidArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                voidArr.getClass();
                try {
                    HttpURLConnection httpURLConnection = this.connection;
                    return httpURLConnection == null ? this.requests.executeAndWait() : GraphRequest.Companion.executeConnectionAndWait(httpURLConnection, this.requests);
                } catch (Exception e) {
                    this.exception = e;
                    return null;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        } catch (Throwable th2) {
            CrashShieldHandler.handleThrowable(th2, this);
            return null;
        }
    }

    public final Exception getException() {
        return this.exception;
    }

    public final GraphRequestBatch getRequests() {
        return this.requests;
    }

    /* renamed from: onPostExecute, reason: avoid collision after fix types in other method */
    public void onPostExecute2(List<GraphResponse> list) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                list.getClass();
                super.onPostExecute((GraphRequestAsyncTask) list);
                Exception exc = this.exception;
                if (exc != null) {
                    Utility.logd(TAG, String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1)));
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.handleThrowable(th2, this);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                super.onPreExecute();
                if (FacebookSdk.isDebugEnabled()) {
                    Utility.logd(TAG, String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1)));
                }
                if (this.requests.getCallbackHandler() == null) {
                    this.requests.setCallbackHandler(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.handleThrowable(th2, this);
        }
    }

    public String toString() {
        return "{RequestAsyncTask:  connection: " + this.connection + ", requests: " + this.requests + "}";
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public GraphRequestAsyncTask(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        graphRequestBatch.getClass();
        this.connection = httpURLConnection;
        this.requests = graphRequestBatch;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(Collection<GraphRequest> collection) {
        this((HttpURLConnection) null, new GraphRequestBatch(collection));
        collection.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(GraphRequestBatch graphRequestBatch) {
        this((HttpURLConnection) null, graphRequestBatch);
        graphRequestBatch.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(HttpURLConnection httpURLConnection, GraphRequest... graphRequestArr) {
        this(httpURLConnection, new GraphRequestBatch((GraphRequest[]) Arrays.copyOf(graphRequestArr, graphRequestArr.length)));
        graphRequestArr.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphRequestAsyncTask(HttpURLConnection httpURLConnection, Collection<GraphRequest> collection) {
        this(httpURLConnection, new GraphRequestBatch(collection));
        collection.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.util.List<? extends com.facebook.GraphResponse>] */
    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ List<? extends GraphResponse> doInBackground(Void[] voidArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                this = doInBackground2(voidArr);
                return this;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        } catch (Throwable th2) {
            CrashShieldHandler.handleThrowable(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(List<? extends GraphResponse> list) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                onPostExecute2((List<GraphResponse>) list);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.handleThrowable(th2, this);
        }
    }
}
