package com.squareup.preferences;

import android.content.SharedPreferences;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes.dex */
public final class SharedPreferencesKeyValue implements KeyValue {
    public final boolean atomic;
    public final String key;
    public final SharedPreferences preferences;
    public final Reader reader;
    public final Writer writer;

    public interface Reader {
        Object read(SharedPreferencesKeyValue sharedPreferencesKeyValue);
    }

    public interface Writer {
        void write(SharedPreferences.Editor editor, Object obj);
    }

    public SharedPreferencesKeyValue(SharedPreferences sharedPreferences, String str, Reader reader, Writer writer, boolean z) {
        sharedPreferences.getClass();
        str.getClass();
        this.preferences = sharedPreferences;
        this.key = str;
        this.reader = reader;
        this.writer = writer;
        this.atomic = z;
    }

    @Override // com.squareup.preferences.KeyValue
    public final Object blockingGet() {
        return this.reader.read(this);
    }

    @Override // com.squareup.preferences.KeyValue
    public final void blockingSet(Object obj) {
        SharedPreferences.Editor edit = this.preferences.edit();
        if (obj == null) {
            edit.remove(this.key);
        } else {
            edit.getClass();
            this.writer.write(edit, obj);
        }
        if (this.atomic) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    @Override // com.squareup.preferences.KeyValue
    public final Object delete(Continuation continuation) {
        CoroutineContext coroutineContext;
        if (this.atomic) {
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            coroutineContext = DefaultIoScheduler.INSTANCE;
        } else {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        Object withContext = JobKt.withContext(coroutineContext, new SharedPreferencesKeyValue$get$2(this, null, 1), continuation);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    @Override // com.squareup.preferences.KeyValue
    public final Object get(Continuation continuation) {
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        return JobKt.withContext(DefaultIoScheduler.INSTANCE, new SharedPreferencesKeyValue$get$2(this, null, 0), continuation);
    }

    @Override // com.squareup.preferences.KeyValue
    public final Flow observe() {
        return FlowKt.distinctUntilChanged(FlowKt.callbackFlow(new PreferenceFlow$flow$1(this, (Continuation) null, 18)));
    }

    @Override // com.squareup.preferences.KeyValue
    public final Object set(Object obj, Continuation continuation) {
        CoroutineContext coroutineContext;
        if (this.atomic) {
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            coroutineContext = DefaultIoScheduler.INSTANCE;
        } else {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        Object withContext = JobKt.withContext(coroutineContext, new RealGcmRegistrar$unregister$2(this, obj, (Continuation) null), continuation);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }
}
