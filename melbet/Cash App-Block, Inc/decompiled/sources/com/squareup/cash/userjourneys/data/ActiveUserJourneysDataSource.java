package com.squareup.cash.userjourneys.data;

import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.userjourneys.notifier.NoOpUserJourneyNotifier;
import com.squareup.moshi.Moshi;
import java.io.File;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class ActiveUserJourneysDataSource extends DiskUserJourneyDataSource {
    public final JsonJourneyListJsonAdapter adapter;
    public final NoOpUserJourneyNotifier userJourneyNotifier;

    public ActiveUserJourneysDataSource(File file, CoroutineContext coroutineContext, NoOpUserJourneyNotifier noOpUserJourneyNotifier, ErrorReporter errorReporter) {
        super(file, coroutineContext, errorReporter);
        this.userJourneyNotifier = noOpUserJourneyNotifier;
        Moshi moshi = this.moshi;
        moshi.getClass();
        this.adapter = new JsonJourneyListJsonAdapter(moshi);
    }

    @Override // com.squareup.cash.userjourneys.data.DiskUserJourneyDataSource
    public final Set deserialize(String str) {
        Set<UserJourney> journeyList;
        JsonJourneyList jsonJourneyList = (JsonJourneyList) this.adapter.fromJson(str);
        return (jsonJourneyList == null || (journeyList = jsonJourneyList.getJourneyList()) == null) ? EmptySet.INSTANCE : journeyList;
    }

    @Override // com.squareup.cash.userjourneys.data.DiskUserJourneyDataSource
    public final void onPersistenceChanged(String str) {
        str.getClass();
        str.getClass();
        this.userJourneyNotifier.getClass();
    }

    @Override // com.squareup.cash.userjourneys.data.DiskUserJourneyDataSource
    public final String serialize(Set set) {
        set.getClass();
        String json = this.adapter.toJson(new JsonJourneyList(set));
        json.getClass();
        return json;
    }
}
