package com.squareup.cash.userjourneys.data;

import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.moshi.Moshi;
import java.io.File;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class CompletedUserJourneysDataSource extends DiskUserJourneyDataSource {
    public final JsonCompletedJourneyListJsonAdapter adapter;

    public CompletedUserJourneysDataSource(File file, CoroutineContext coroutineContext, ErrorReporter errorReporter) {
        super(file, coroutineContext, errorReporter);
        Moshi moshi = this.moshi;
        moshi.getClass();
        this.adapter = new JsonCompletedJourneyListJsonAdapter(moshi);
    }

    @Override // com.squareup.cash.userjourneys.data.DiskUserJourneyDataSource
    public final Set deserialize(String str) {
        Set<CompletedJourney> journeyList;
        JsonCompletedJourneyList jsonCompletedJourneyList = (JsonCompletedJourneyList) this.adapter.fromJson(str);
        return (jsonCompletedJourneyList == null || (journeyList = jsonCompletedJourneyList.getJourneyList()) == null) ? EmptySet.INSTANCE : journeyList;
    }

    @Override // com.squareup.cash.userjourneys.data.DiskUserJourneyDataSource
    public final String serialize(Set set) {
        set.getClass();
        String json = this.adapter.toJson(new JsonCompletedJourneyList(set));
        json.getClass();
        return json;
    }
}
