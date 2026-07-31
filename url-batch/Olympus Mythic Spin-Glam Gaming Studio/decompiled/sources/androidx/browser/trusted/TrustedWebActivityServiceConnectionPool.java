package androidx.browser.trusted;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

/* loaded from: classes4.dex */
public final class TrustedWebActivityServiceConnectionPool {

    static class BindToServiceAsyncTask extends AsyncTask<Void, Void, Exception> {
        private final Context mAppContext;
        private final ConnectionHolder mConnection;
        private final Intent mIntent;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Exception doInBackground(Void... voidArr) {
            try {
                if (this.mAppContext.bindService(this.mIntent, this.mConnection, 4097)) {
                    return null;
                }
                this.mAppContext.unbindService(this.mConnection);
                return new IllegalStateException("Could not bind to the service");
            } catch (SecurityException e) {
                Log.w("TWAConnectionPool", "SecurityException while binding.", e);
                return e;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Exception exc) {
            if (exc != null) {
                this.mConnection.cancel(exc);
            }
        }
    }
}
