package squareup.cash.registrar.api;

import app.cash.api.ApiResult;
import com.squareup.protos.cash.registrar.api.GetAvailableStatementsForStatementTypeRequest;
import com.squareup.protos.cash.registrar.api.GetAvailableStatementsForStatementTypeResponse;
import com.squareup.protos.cash.registrar.api.GetStatementDescriptorRequest;
import com.squareup.protos.cash.registrar.api.GetStatementDescriptorResponse;
import com.squareup.protos.cash.registrar.api.GetStatementTypesRequest;
import com.squareup.protos.cash.registrar.api.GetStatementTypesResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lsquareup/cash/registrar/api/RegistrarClientService;", "", "getStatementAccounts", "Lapp/cash/api/ApiResult;", "Lcom/squareup/protos/cash/registrar/api/GetStatementTypesResponse;", "request", "Lcom/squareup/protos/cash/registrar/api/GetStatementTypesRequest;", "(Lcom/squareup/protos/cash/registrar/api/GetStatementTypesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAvailableAccountStatements", "Lcom/squareup/protos/cash/registrar/api/GetAvailableStatementsForStatementTypeResponse;", "Lcom/squareup/protos/cash/registrar/api/GetAvailableStatementsForStatementTypeRequest;", "(Lcom/squareup/protos/cash/registrar/api/GetAvailableStatementsForStatementTypeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStatementDescriptor", "Lcom/squareup/protos/cash/registrar/api/GetStatementDescriptorResponse;", "Lcom/squareup/protos/cash/registrar/api/GetStatementDescriptorRequest;", "(Lcom/squareup/protos/cash/registrar/api/GetStatementDescriptorRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RegistrarClientService {
    @POST("/cash-app/banking-statements/statements/list")
    Object getAvailableAccountStatements(@Body GetAvailableStatementsForStatementTypeRequest getAvailableStatementsForStatementTypeRequest, Continuation<? super ApiResult<GetAvailableStatementsForStatementTypeResponse>> continuation);

    @POST("/cash-app/banking-statements/types/list")
    Object getStatementAccounts(@Body GetStatementTypesRequest getStatementTypesRequest, Continuation<? super ApiResult<GetStatementTypesResponse>> continuation);

    @POST("/cash-app/banking-statements/statement/descriptor")
    Object getStatementDescriptor(@Body GetStatementDescriptorRequest getStatementDescriptorRequest, Continuation<? super ApiResult<GetStatementDescriptorResponse>> continuation);
}
